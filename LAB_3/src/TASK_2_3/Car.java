package TASK_2_3;

public class Car {
    private int id;
    private String type; // "ELECTRIC" sau "GAS"
    private String passengers; // "PEOPLE" sau "ROBOTS"
    private boolean isDining; // true sau false
    private int consumption; // consumul (în intervalul 10-50)

    // Constructor
    public Car(int id, String type, String passengers, boolean isDining, int consumption) {
        this.id = id;
        this.type = type;
        this.passengers = passengers;
        this.isDining = isDining;
        this.consumption = consumption;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getPassengers() {
        return passengers;
    }

    public boolean isDining() {
        return isDining;
    }

    public int getConsumption() {
        return consumption;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public void setDining(boolean isDining) {
        this.isDining = isDining;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    // Metoda toString pentru afișare ușoară
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", passengers='" + passengers + '\'' +
                ", isDining=" + isDining +
                ", consumption=" + consumption +
                '}';
    }
}

