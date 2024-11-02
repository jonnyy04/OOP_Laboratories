package LAB_2.Task_2;

public class Main {
    public static void main(String[] args) {
        Coffee cup1 = new Coffee(Intensity.LIGHT);
        Americano cup2 = new Americano(Intensity.STRONG, 100);
        Cappuccino cup3 = new Cappuccino(Intensity.LIGHT, 300);
        PumpkinSpiceLatte cup4  = new PumpkinSpiceLatte(Intensity.STRONG, 100, 50);
        SyrupCappuccino cup5 = new SyrupCappuccino(Intensity.LIGHT, 120, SyrupType.CARAMEL);

        cup1.PrintDetails();
        cup2.PrintDetails();
        cup3.PrintDetails();
        cup4.PrintDetails();
        cup5.PrintDetails();

    }
}
