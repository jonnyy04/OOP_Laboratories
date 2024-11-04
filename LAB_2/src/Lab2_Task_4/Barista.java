package Lab2_Task_4;

import Lab2_Task_4.CoffeeTypes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barista {

    private Scanner scanner = new Scanner(System.in);
    private List<Coffee> orderList = new ArrayList<>();

    public void startOrdering() {
        boolean ordering = true;

        while (ordering) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. View coffee details");
            System.out.println("2. Add a coffee to your order");
            System.out.println("3. Finish and send order to Barista");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showDetails();
                case 2 -> addCoffeeToOrder();
                case 3 -> {
                    ordering = false;
                    sendOrderToBarista();
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void showDetails() {
        System.out.println("\nMenu:");
        System.out.println("\nAvailable coffee types:");
        System.out.println("1. Americano");
        System.out.println("2. Cappuccino");
        System.out.println("3. Pumpkin Spice Latte");
        System.out.println("4. Syrup Cappuccino");
    }

    private void addCoffeeToOrder() {
        System.out.println("\nChoose the coffee you'd like to add to your order:");
        System.out.println("1. Americano");
        System.out.println("2. Cappuccino");
        System.out.println("3. Pumpkin Spice Latte");
        System.out.println("4. Syrup Cappuccino");

        int choice = scanner.nextInt();
        Coffee coffee;

        // Prompt the user to select the intensity
        System.out.println("Select intensity level:");
        System.out.println("1. Light");
        System.out.println("2. Normal");
        System.out.println("3. Strong");

        Intensity intensity;
        int intensityChoice = scanner.nextInt();
        switch (intensityChoice) {
            case 1 -> intensity = Intensity.LIGHT;
            case 2 -> intensity = Intensity.NORMAL;
            case 3 -> intensity = Intensity.STRONG;
            default -> {
                System.out.println("Invalid choice. Setting intensity to NORMAL.");
                intensity = Intensity.NORMAL;
            }
        }

        switch (choice) {
            case 1 -> {
                System.out.print("Enter amount of water (ml): ");
                int water = scanner.nextInt();
                coffee = new Americano(intensity, water);
            }
            case 2 -> {
                System.out.print("Enter amount of milk (ml): ");
                int milk = scanner.nextInt();
                coffee = new Cappuccino(intensity, milk);
            }
            case 3 -> {
                System.out.print("Enter amount of milk (ml): ");
                int milk = scanner.nextInt();
                System.out.print("Enter amount of pumpkin spice (mg): ");
                int pumpkinSpice = scanner.nextInt();
                coffee = new PumpkinSpiceLatte(intensity, milk, pumpkinSpice);
            }
            case 4 -> {
                System.out.print("Enter amount of milk (ml): ");
                int milk = scanner.nextInt();
                System.out.print("Choose syrup type:\n 1. MACADAMIA\n2. VANILLA\n3. COCONUT\n4. CARAMEL\n5. CHOCOLATE\n6. POPCORN\n");
                SyrupType syrup;
                int secnodChoise = scanner.nextInt();
                switch (secnodChoise){
                    case 1 -> syrup = SyrupType.MACADAMIA;
                    case 2 -> syrup = SyrupType.VANILLA;
                    case 3 -> syrup = SyrupType.COCONUT;
                    case 4 -> syrup = SyrupType.CARAMEL;
                    case 5 -> syrup = SyrupType.CHOCOLATE;
                    case 6 -> syrup = SyrupType.POPCORN;
                    default -> {
                        System.out.println("Invalid choice. Setting to CHOCOLATE");
                        syrup = SyrupType.CHOCOLATE;
                    }
                }
                coffee = new SyrupCappuccino(intensity, milk, syrup);
            }
            default -> {
                System.out.println("Invalid choice. Returning to menu.");
                return;
            }
        }

        orderList.add(coffee);

    }

    private void sendOrderToBarista() {
        System.out.println("\nSending order to Barista...");
        System.out.println("Order summary:");

        for (Coffee coffee : orderList) {
            coffee.PrintDetails();
            System.out.println("------");
        }

        System.out.println("Please wait, your order is being prepared...");

        for (Coffee coffee : orderList) {

            // Switch based on the name of the coffee to call the appropriate make method
            switch (coffee.getName()) {
                case "americano" -> ((Americano) coffee).makeAmericano();
                case "Cappuccino" -> ((Cappuccino) coffee).makeCappuccino();
                case "Pumpkin Spice Latte" -> ((PumpkinSpiceLatte) coffee).makePumpkinSpiceLatte();
                case "SyrupCappuccino" -> ((SyrupCappuccino) coffee).makeSyrupCappuccino();
                default -> System.out.println("Unknown coffee type.");
            }
            System.out.println("----------------------------");
        }

        System.out.println("Order complete. Enjoy your coffee!");
    }

}

