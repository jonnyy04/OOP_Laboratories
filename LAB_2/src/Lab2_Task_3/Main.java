package Lab2_Task_3;

public class Main {
    public static void main(String[] args) {
        Coffee cup1 = new Coffee(Intensity.LIGHT);
        Americano cup2 = new Americano(Intensity.STRONG, 100);
        Cappuccino cup3 = new Cappuccino(Intensity.LIGHT, 300);
        PumpkinSpiceLatte cup4  = new PumpkinSpiceLatte(Intensity.STRONG, 100, 50);
        SyrupCappuccino cup5 = new SyrupCappuccino(Intensity.LIGHT, 120, SyrupType.CARAMEL);

        cup1.makeCoffee();
        cup2.makeAmericano();
        cup3.makeCappuccino();
        cup4.makePumpkinSpiceLatte();
        cup5.makeSyrupCappuccino();

    }
}
