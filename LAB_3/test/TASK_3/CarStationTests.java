package TASK_3;

import TASK_1.LinkedListQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarStationTests {

    private LinkedListQueue<Car> carQueue;
    private CarStation carStation;
    private PeopleDinner mockDineable;
    private MockRefuelable mockRefuelable;

    @BeforeEach
    public void setUp() {
        carQueue = new LinkedListQueue<>();
        mockDineable = new MockDineable();
        mockRefuelable = new MockRefuelable();
        carStation = new CarStation(mockDineable, mockRefuelable);
    }

    @Test
    public void testAddCarToQueue() {
        Car car = new Car(1, "ELECTRIC", "PEOPLE", true, 20);
        carStation.addCar(car);

        assertFalse(carQueue.isEmpty(), "Queue should not be empty after adding a car");
        assertEquals(car, carQueue.peek(), "The car added should be the first in the queue");
    }

    @Test
    public void testServeCars() {
        Car car1 = new Car(1, "ELECTRIC", "PEOPLE", true, 20);
        Car car2 = new Car(2, "GAS", "ROBOTS", false, 15);

        carStation.addCar(car1);
        carStation.addCar(car2);

        carStation.serveCars();

        assertTrue(carQueue.isEmpty(), "Queue should be empty after serving all cars");
        assertEquals(1, mockDineable.getCarsServed(), "One car should have been served dinner");
        assertEquals(2, mockRefuelable.getCarsRefueled(), "Two cars should have been refueled");
    }
}
