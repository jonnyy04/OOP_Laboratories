package LAB_2.Task_1;

class Cappuccino extends Coffee{

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
}
