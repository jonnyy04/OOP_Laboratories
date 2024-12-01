package TASK_3;

import TASK_1.LinkedListQueue;
import TASK_2_3.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarStationTests {

    private CarStation carStation;
    private Dineable dineable;
    private Refuelable refuelable;

    @BeforeEach
    public void setUp() {

        PeopleDinner.resetPeopleServed();
        ElectricStation.resetElectricCarsServed();

        dineable = new PeopleDinner();
        refuelable = new ElectricStation();
        carStation = new CarStation(dineable, refuelable);
    }

    @Test
    public void testServeCars() {
        Car car1 = new Car(1, "ELECTRIC", "PEOPLE", true, 20);
        Car car2 = new Car(2, "ELECTRIC", "ROBOTS", false, 15);

        carStation.addCar(car1);
        carStation.addCar(car2);

        carStation.serveCars();

        assertTrue(carStation.getQueue().isEmpty(), "Queue should be empty after serving all cars");
        assertEquals(1, PeopleDinner.getPeopleServed(), "One car should have been served dinner");
        assertEquals(2, ElectricStation.getElectricCarsServed(), "Two cars should have been refueled");
    }

    @Test
    public void testAddCarToQueue() {
        Car car = new Car(1, "ELECTRIC", "PEOPLE", true, 20);
        carStation.addCar(car);

        assertFalse(carStation.getQueue().isEmpty(), "Queue should not be empty after adding a car");
        assertEquals(car, carStation.getQueue().peek(), "The car added should be the first in the queue");
    }


    // Test 1: Comportamentul când nu sunt adăugate mașini în coadă
    @Test
    public void testServeCarsWithEmptyQueue() {
        carStation.serveCars();

        assertTrue(carStation.getQueue().isEmpty(), "Queue should be empty, no cars were added");
        assertEquals(0, PeopleDinner.getPeopleServed(), "No cars should have been served dinner");
        assertEquals(0, ElectricStation.getElectricCarsServed(), "No cars should have been refueled");
    }

    // Test 2: Caz când doar mașinile care nu au nevoie de servirea mesei sunt adăugate
    @Test
    public void testServeCarsWithoutDining() {
        Car car1 = new Car(1, "ELECTRIC", "PEOPLE", false, 20);  // Mașină care nu necesită servirea mesei
        Car car2 = new Car(2, "GAS", "ROBOTS", false, 15);  // Mașină care nu necesită servirea mesei

        carStation.addCar(car1);
        carStation.addCar(car2);

        carStation.serveCars();

        assertTrue(carStation.getQueue().isEmpty(), "Queue should be empty after serving all cars");
        assertEquals(0, PeopleDinner.getPeopleServed(), "No cars should have been served dinner");
        assertEquals(2, ElectricStation.getElectricCarsServed(), "Two cars should have been refueled");
    }
}
