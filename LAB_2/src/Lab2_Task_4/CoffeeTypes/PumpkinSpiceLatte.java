package Lab2_Task_4.CoffeeTypes;

public class PumpkinSpiceLatte extends Cappuccino {
    private int mgOfPumpkinSpice;
    private final String name = "Pumpkin Spice Latte";

    public PumpkinSpiceLatte(Intensity intensityOfCoffee, int mlOfMilk, int mgOfPumpkinSpice) {
        super(intensityOfCoffee, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }

    public void setMgOfPumpkinSpice(int mg) {
        this.mgOfPumpkinSpice = mg;
    }

    public String getName() {
        return name;
    }

    @Override
    public void PrintDetails(){
        super.PrintDetails();
        System.out.println("mgOfPumpkinSpice: " + mgOfPumpkinSpice);
    }

    public final PumpkinSpiceLatte makePumpkinSpiceLatte() {
        System.out.println("\nMaking " + name);
        System.out.println("Intensity set to " + super.getCoffeeIntensity());
        System.out.println("Adding " + getMlOfMilk() + " mls of milk");
        System.out.println("Adding " + getMgOfPumpkinSpice() + " mg of Pumpkin Spice");
        return this;
    }
}

