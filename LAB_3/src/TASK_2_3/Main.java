package TASK_2_3;

public class Main {
    public static void main(String[] args) {
        // Creăm servicii specifice
        Dineable peopleDining = new PeopleDinner();
        Refuelable electricStation = new ElectricStation();

        // Creăm o stație de mașini
        CarStation station = new CarStation(peopleDining, electricStation);

        // Adăugăm mașini
        station.addCar(new Car(1, "ELECTRIC", "PEOPLE", true, 20));
        station.addCar(new Car(2, "ELECTRIC", "PEOPLE", false, 15));

        // Procesăm mașinile
        station.serveCars();
    }
}


