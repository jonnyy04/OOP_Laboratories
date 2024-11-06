package Lab2_Task_4.CoffeeTypes;

public class Cappuccino extends Coffee {

    private int mlOfMilk;
    private final String name = "Cappuccino";

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity);
        this.mlOfMilk = mlOfMilk;
    }

    public void setMlOfMilk(int mlOfMilk) {
        this.mlOfMilk = mlOfMilk;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("mlOfMilk: " + mlOfMilk);
    }

    public final Cappuccino makeCappuccino() {
        super.makeCoffee();
        System.out.println("Adding " + getMlOfMilk() + " mls of milk");
        return this;
    }

}
