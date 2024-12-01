package TASK_2_3;

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

    // Resetare pentru test
    public static void resetElectricCarsServed() {
        electricCarsServed = 0;
    }
}

