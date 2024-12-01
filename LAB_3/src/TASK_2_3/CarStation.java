package TASK_2_3;

import TASK_1.LinkedListQueue;

public class CarStation {
    private Dineable diningService;
    private Refuelable refuelingService;
    private LinkedListQueue<Car> queue;
    private static int dining = 0;
    private static int notDining = 0;

    // Constructor
    public CarStation(Dineable diningService, Refuelable refuelingService) {
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = new LinkedListQueue<>();
    }

    // Metoda pentru a adăuga mașini în coadă
    public void addCar(Car car) {
        queue.enqueue(car);
        //System.out.println("Added car to the queue: " + car);
    }

    // Metoda pentru a procesa mașinile
    public void serveCars() {
        while (!queue.isEmpty()) {
            Car car = queue.dequeue();

            if (car.isDining()) {
                dining++;
                diningService.serveDinner(String.valueOf(car.getId()));
            }else {
                notDining++;
            }
            refuelingService.refuel(String.valueOf(car.getId()));
        }
        //System.out.println("All cars have been served.");
    }

    public LinkedListQueue<Car> getQueue() {
        return queue;
    }

    public static int getDining() {
        return dining;
    }
    public static int getNotDining() {
        return notDining;
    }
}

