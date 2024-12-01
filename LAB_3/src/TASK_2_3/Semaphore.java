package TASK_2_3;

public class Semaphore {

    Dineable peopleDining = new PeopleDinner();
    Refuelable electricStation = new ElectricStation();
    Dineable robotsDining = new RobotDinner();
    Refuelable gasStation = new GasStation();

    // Stațiile care primesc mașinile
    private CarStation gas_people_Station = new CarStation(peopleDining, gasStation);
    private CarStation gas_robots_Station = new CarStation(robotsDining, gasStation);
    private CarStation electric_people_Station = new CarStation(peopleDining, electricStation);
    private CarStation electric_robots_Station = new CarStation(robotsDining, electricStation);

    // Metoda care ghidează mașinile către stația corectă
    public void guideCar(Car car) {
        if (car.getType().equals("GAS") && car.getPassengers().equals("PEOPLE")) {
            gas_people_Station.addCar(car); // Stație pe benzină pentru oameni
            gas_people_Station.serveCars();
        } else if (car.getType().equals("GAS") && car.getPassengers().equals("ROBOTS")) {
            gas_robots_Station.addCar(car); // Stație pe benzină pentru roboți
            gas_robots_Station.serveCars();
        } else if (car.getType().equals("ELECTRIC") && car.getPassengers().equals("PEOPLE")) {
            electric_people_Station.addCar(car); // Stație electrică pentru oameni
            electric_people_Station.serveCars();
        } else if (car.getType().equals("ELECTRIC") && car.getPassengers().equals("ROBOTS")) {
            electric_robots_Station.addCar(car); // Stație electrică pentru roboți
            electric_robots_Station.serveCars();
        }
    }
}


