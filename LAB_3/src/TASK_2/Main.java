package TASK_2;

public class Main {
    public static void main(String[] args) {

        // Test pentru PeopleDinner
        System.out.println("Testing PeopleDinner:");
        PeopleDinner peopleDinner = new PeopleDinner();
        peopleDinner.serveDinner("Car1");
        System.out.println("Expected: Serving dinner to people in car Car1.");
        System.out.println("--------------------------------------------------");

        // Test pentru RobotDinner
        System.out.println("Testing RobotDinner:");
        RobotDinner robotDinner = new RobotDinner();
        robotDinner.serveDinner("Car2");
        System.out.println("Expected: Serving dinner to robots in car Car2.");
        System.out.println("--------------------------------------------------");

        // Test pentru ElectricStation
        System.out.println("Testing ElectricStation:");
        ElectricStation electricStation = new ElectricStation();
        electricStation.refuel("Car3");
        System.out.println("Expected: Refueling electric car Car3.");
        System.out.println("--------------------------------------------------");

        // Test pentru GasStation
        System.out.println("Testing GasStation:");
        GasStation gasStation = new GasStation();
        gasStation.refuel("Car4");
        System.out.println("Expected: Refueling gas car Car4.");
        System.out.println("--------------------------------------------------");

        // Test pentru contorizarea serviciilor
        System.out.println("Testing service count:");
        peopleDinner.serveDinner("Car5");
        robotDinner.serveDinner("Car6");
        electricStation.refuel("Car7");
        gasStation.refuel("Car8");

        System.out.println("People served: " + PeopleDinner.getPeopleServed() + " (Expected: 2)");
        System.out.println("Robots served: " + RobotDinner.getRobotsServed() + " (Expected: 2)");
        System.out.println("Electric cars refueled: " + ElectricStation.getElectricCarsServed() + " (Expected: 2)");
        System.out.println("Gas cars refueled: " + GasStation.getGasCarsServed() + " (Expected: 2)");
        System.out.println("--------------------------------------------------");

        // Test fără mașini care doresc masă
        System.out.println("Testing cars without dinner:");
        System.out.println("People served: " + PeopleDinner.getPeopleServed() + " (Expected: 2)");
        System.out.println("Robots served: " + RobotDinner.getRobotsServed() + " (Expected: 2)");
    }
}

