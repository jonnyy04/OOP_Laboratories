package Lab2_Task_2;


class Cappuccino extends Coffee {

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
    public void PrintDetails() {
        super.PrintDetails();
        System.out.println("mlOfMilk: " + mlOfMilk);
    }

}
