package TASK_2_3;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    // Variabile globale pentru consumul total
    private static int electricConsumption = 0;
    private static int gasConsumption = 0;

    public static void main(String[] args) {
        String folderPath = "LAB_3/Generator/queue";
        ObjectMapper objectMapper = new ObjectMapper();
        Semaphore semaphore = new Semaphore();

        // Set pentru a reține fișierele deja procesate
        Set<String> processedFiles = new HashSet<>();

        // Programăm verificarea periodică folosind ScheduledExecutorService
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> {
            File folder = new File(folderPath);

            if (!folder.exists() || !folder.isDirectory()) {
                System.err.println("Folderul nu există sau nu este un director: " + folderPath);
                return;
            }

            // Listăm fișierele JSON din folder
            File[] files = folder.listFiles((dir, name) -> name.endsWith(".json"));
            if (files != null && files.length > 0) {
                for (File file : files) {
                    if (!processedFiles.contains(file.getName())) {
                        processedFiles.add(file.getName()); // Marcam fișierul ca procesat
                        System.out.println("------------------------------------");
                        System.out.println("Fișier " + file.getName());

                        try {
                            // Citim fișierul JSON ca JsonNode
                            JsonNode rootNode = objectMapper.readTree(file);

                            int id = rootNode.get("id").asInt();
                            String type = rootNode.get("type").asText();
                            String passengers = rootNode.get("passengers").asText();
                            boolean isDining = rootNode.get("isDining").asBoolean();
                            int consumption = rootNode.get("consumption").asInt();

                            Car car = new Car(id, type, passengers, isDining, consumption);
                            System.out.println("Mașina citită:");
                            System.out.println(car);
                            semaphore.guideCar(car);

                            // Actualizăm consumul total în funcție de tipul mașinii
                            if ("ELECTRIC".equalsIgnoreCase(type)) {
                                electricConsumption += consumption;
                            } else if ("GAS".equalsIgnoreCase(type)) {
                                gasConsumption += consumption;
                            }

                        } catch (IOException e) {
                            System.err.println("Eroare la citirea fișierului " + file.getName() + ": " + e.getMessage());
                        }
                    }
                }
            }
        }, 0, 5, TimeUnit.SECONDS); // Verificăm folderul la fiecare 5 secunde

        // Închidem programul după 1 minut pentru demonstrație
        try {
            Thread.sleep(70000); // Rulăm programul timp de 1 minut
            scheduler.shutdown();
            System.out.println("{\"ELECTRIC\": " + ElectricStation.getElectricCarsServed() +
                    ", \"GAS\": " + GasStation.getGasCarsServed() +
                    ", \"PEOPLE\": " + Semaphore.getPeople() +
                    ", \"ROBOTS\": " + Semaphore.getRobots() +
                    ", \"DINING\": " + CarStation.getDining() +
                    ", \"NOT_DINING\": " + CarStation.getNotDining() +
                    ", \"CONSUMPTION\": " +
                    "{\"ELECTRIC\": " + electricConsumption +
                    ", \"GAS\": " + gasConsumption + "}}");
        } catch (InterruptedException e) {
            System.err.println("Thread-ul principal a fost întrerupt: " + e.getMessage());
        }
    }
}
