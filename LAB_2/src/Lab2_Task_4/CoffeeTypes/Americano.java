package Lab2_Task_4.CoffeeTypes;

public class Americano extends Coffee {

    private int mlOfWater;
    private  final String name = "americano";

    public Americano(Intensity intensityOfCoffee, int  mlOfWater) {
        super(intensityOfCoffee);
        this.mlOfWater = mlOfWater;
    }

    public void setMlOfWater(int mlOfWater) {
        this.mlOfWater = mlOfWater;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void PrintDetails() {
        super.PrintDetails();
        System.out.println("Ml of water: " + mlOfWater);
    }

    public final Americano makeAmericano() {
        System.out.println("\nMaking " + getName());
        System.out.println("Intensity set to " + getCoffeeIntensity());
        System.out.println("Adding " + mlOfWater + " mls of water");
        return this;
    }
}
