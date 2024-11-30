package TASK_2;

public class RobotDinner implements Dineable {
    private static int robotsServed = 0;

    @Override
    public void serveDinner(String carId) {
        robotsServed++;
        System.out.println("Serving dinner to robots in car " + carId + ".");
    }

    public static int getRobotsServed() {
        return robotsServed;
    }
}

