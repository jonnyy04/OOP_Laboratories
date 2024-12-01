package TASK_2_3;

import TASK_1.LinkedListQueue;

public class CarStation {
    private Dineable diningService;
    private Refuelable refuelingService;
    private LinkedListQueue<Car> queue;

    // Constructor
    public CarStation(Dineable diningService, Refuelable refuelingService) {
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = new LinkedListQueue<>();
    }

    // Metoda pentru a adăuga mașini în coadă
    public void addCar(Car car) {
        queue.enqueue(car);
        System.out.println("Added car to the queue: " + car);
    }

    // Metoda pentru a procesa mașinile
    public void serveCars() {
        while (!queue.isEmpty()) {
            Car car = queue.dequeue();
            System.out.println("Serving car: " + car);

            if (car.isDining()) {
                diningService.serveDinner(String.valueOf(car.getId()));
            }
            refuelingService.refuel(String.valueOf(car.getId()));
        }
        System.out.println("All cars have been served.");
    }
}

