package Lab2_Task_2;

public class PumpkinSpiceLatte extends Cappuccino {
    private int mgOfPumpkinSpice;
    private final String name = "Pumpkin Spice Latte";

    PumpkinSpiceLatte(Intensity intensityOfCoffee, int mlOfMilk, int mgOfPumpkinSpice) {
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
}

