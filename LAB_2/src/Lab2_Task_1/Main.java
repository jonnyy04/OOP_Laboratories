package Lab2_Task_1;

public class Main {
    public static void main(String[] args) {
        // Create a regular Coffee instance
        Coffee regularCoffee = new Coffee(Intensity.NORMAL);
        System.out.println("Coffee name: " + regularCoffee.getName());
        System.out.println("Intensity: " + regularCoffee.getCoffeeIntensity());

        // Create a Cappuccino instance
        Cappuccino cappuccino = new Cappuccino(Intensity.STRONG, 150);
        System.out.println("\nCoffee name: " + cappuccino.getName());
        System.out.println("Intensity: " + cappuccino.getCoffeeIntensity());
        System.out.println("Milk amount (ml): " + cappuccino.getMlOfMilk());

        // Create an Americano instance
        Americano americano = new Americano(Intensity.LIGHT, 200);
        System.out.println("\nCoffee name: " + americano.getName());
        System.out.println("Intensity: " + americano.getCoffeeIntensity());
        System.out.println("Water amount (ml): " + americano.getMlOfWater());

        // Create a SyrupCappuccino instance
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.NORMAL, 150, SyrupType.VANILLA);
        System.out.println("\nCoffee name: " + syrupCappuccino.getCoffee());
        System.out.println("Intensity: " + syrupCappuccino.getCoffeeIntensity());
        System.out.println("Milk amount (ml): " + syrupCappuccino.getMlOfMilk());
        System.out.println("Syrup flavor: " + syrupCappuccino.getSyrup());

        // Create a PumpkinSpiceLatte instance
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.STRONG, 150, 30);
        System.out.println("\nCoffee name: " + pumpkinSpiceLatte.getName());
        System.out.println("Intensity: " + pumpkinSpiceLatte.getCoffeeIntensity());
        System.out.println("Milk amount (ml): " + pumpkinSpiceLatte.getMlOfMilk());
        System.out.println("Pumpkin spice amount (mg): " + pumpkinSpiceLatte.getMgOfPumpkinSpice());
    }
}
