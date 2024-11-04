package Lab2_Task_4.CoffeeTypes;

public class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup;
    private final String coffee = "SyrupCappuccino";

    public SyrupCappuccino(Intensity intensityCoffee, int mlOfWater, SyrupType syrup) {
        super(intensityCoffee, mlOfWater);
        this.syrup = syrup;
    }

    public SyrupType getSyrup() {
        return syrup;
    }

    public void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    public String getName() {
        return coffee;
    }

    @Override
    public void PrintDetails(){
        super.PrintDetails();
        System.out.println("Syrup: " + syrup);
    }

    public final SyrupCappuccino makeSyrupCappuccino() {
        System.out.println("\nMaking " + getName());
        System.out.println("Intensity set to " + getCoffeeIntensity());
        System.out.println("Adding " + getMlOfMilk() + " mls of milk");
        System.out.println("Adding " + syrup + " syrup");
        return this;
    }
}
