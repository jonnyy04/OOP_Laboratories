package TASK_2;

public class ElectricStation implements Refuelable {
    private static int electricCarsServed = 0;

    @Override
    public void refuel(String carId) {
        electricCarsServed++;
        System.out.println("Refueling electric car " + carId + ".");
    }

    public static int getElectricCarsServed() {
        return electricCarsServed;
    }
}

