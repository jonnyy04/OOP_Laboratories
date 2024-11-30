package TASK_2;

public class GasStation implements Refuelable {
    private static int gasCarsServed = 0;

    @Override
    public void refuel(String carId) {
        gasCarsServed++;
        System.out.println("Refueling gas car " + carId + ".");
    }

    public static int getGasCarsServed() {
        return gasCarsServed;
    }
}

