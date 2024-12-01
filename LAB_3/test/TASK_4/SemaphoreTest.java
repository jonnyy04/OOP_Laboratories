import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TASK_2_3.*;


public class SemaphoreTest {

    private Semaphore semaphore;
    private CarStation gas_people_Station;
    private CarStation gas_robots_Station;
    private CarStation electric_people_Station;
    private CarStation electric_robots_Station;

    @BeforeEach
    public void setUp() {
        semaphore = new Semaphore();

        // Accessing the car stations directly for validation in tests
        gas_people_Station = new CarStation(new PeopleDinner(), new GasStation());
        gas_robots_Station = new CarStation(new RobotDinner(), new GasStation());
        electric_people_Station = new CarStation(new PeopleDinner(), new ElectricStation());
        electric_robots_Station = new CarStation(new RobotDinner(), new ElectricStation());

        // Reset the counters before each test
        GasStation.resetGasCarsServed();
        ElectricStation.resetElectricCarsServed();
        PeopleDinner.resetPeopleServed();
        RobotDinner.resetRobotsServed();
    }

    @Test
    public void testGuideElectricCarForPeople() {
        Car electricCarForPeople = new Car(1, "ELECTRIC", "PEOPLE", true, 42);

        semaphore.guideCar(electricCarForPeople);

        // Verify that only the electric car for people is served
        assertEquals(0, GasStation.getGasCarsServed(), "No gas cars should be served.");
        assertEquals(1, ElectricStation.getElectricCarsServed(), "One electric car for people should be served.");
        assertEquals(1, PeopleDinner.getPeopleServed(), "One people car should be served dinner.");
        assertEquals(0, RobotDinner.getRobotsServed(), "No robots should be served.");
    }

    @Test
    public void testGuideElectricCarForRobots() {
        Car electricCarForRobots = new Car(2, "ELECTRIC", "ROBOTS", true, 26);

        semaphore.guideCar(electricCarForRobots);

        // Verify that only the electric car for robots is served
        assertEquals(0, GasStation.getGasCarsServed(), "No gas cars should be served.");
        assertEquals(1, ElectricStation.getElectricCarsServed(), "One electric car for robots should be served.");
        assertEquals(0, PeopleDinner.getPeopleServed(), "No people cars should be served dinner.");
        assertEquals(1, RobotDinner.getRobotsServed(), "One robot car should be served dinner.");
    }

    @Test
    public void testGuideGasCarForPeople() {
        Car gasCarForPeople = new Car(3, "GAS", "PEOPLE", true, 41);

        semaphore.guideCar(gasCarForPeople);

        // Verify that only the gas car for people is served
        assertEquals(1, GasStation.getGasCarsServed(), "One gas car for people should be served.");
        assertEquals(0, ElectricStation.getElectricCarsServed(), "No electric cars should be served.");
        assertEquals(1, PeopleDinner.getPeopleServed(), "One people car should be served dinner.");
        assertEquals(0, RobotDinner.getRobotsServed(), "No robots should be served.");
    }

    @Test
    public void testGuideGasCarForRobots() {
        Car gasCarForRobots = new Car(4, "GAS", "ROBOTS", true, 41);

        semaphore.guideCar(gasCarForRobots);

        // Verify that only the gas car for robots is served
        assertEquals(1, GasStation.getGasCarsServed(), "One gas car for robots should be served.");
        assertEquals(0, ElectricStation.getElectricCarsServed(), "No electric cars should be served.");
        assertEquals(0, PeopleDinner.getPeopleServed(), "No people cars should be served dinner.");
        assertEquals(1, RobotDinner.getRobotsServed(), "One robot car should be served dinner.");
    }
}
