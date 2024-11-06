package Lab2_Task_1;

public class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup;
    private final String coffee = "SyrupCappuccino";

    public SyrupCappuccino(Intensity intensityCoffee,int mlOfWater, SyrupType  syrup) {
        super(intensityCoffee, mlOfWater);
        this.syrup = syrup;
    }

    public SyrupType getSyrup() {
        return syrup;
    }

    public void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    public String getCoffee() {
        return coffee;
    }
}
