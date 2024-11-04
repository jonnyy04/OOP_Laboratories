package Lab2_Task_4.CoffeeTypes;

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

    public void PrintDetails(){
         System.out.println("\nName: " + getName());
         System.out.println("Coffee Intensity: " + coffeeIntensity);
    }

    public Coffee makeCoffee() {
        System.out.println("\nMaking " + name);
        System.out.println("Intensity set to " + getCoffeeIntensity());

        return this;
    }
}

