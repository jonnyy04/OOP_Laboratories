package LAB_2.Task_2;

public class Americano extends Coffee {

    private int mlOfWater;
    private  final String name = "americano";

    Americano(Intensity intensityOfCoffee, int  mlOfWater) {
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
}
