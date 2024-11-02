package LAB_2.Task_1;

public class Coffee {
     private Intensity coffeeIntensity;
     private final String name = "Coffee";

     Coffee(Intensity coffeeIntensity) {
         this.coffeeIntensity = coffeeIntensity;
     }
     public void setCoffeeIntensity(Intensity coffeeIntensity) {
         this.coffeeIntensity = coffeeIntensity;
     }

     public Intensity getCoffeeIntensity() {
         return coffeeIntensity;
     }

    public String getName() {
        return name;
    }
}

enum Intensity {
    LIGHT, NORMAL, STRONG
}

enum SyrupType {
    MACADAMIA, VANILLA, COCONUT, CARAMEL, CHOCOLATE, POPCORN
}