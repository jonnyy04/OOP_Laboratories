package Task_1;

public class Display {
    // Attributes
    private int width;
    private int height;
    private float ppi;
    private String model;

    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    public void compareSize(Display m) {
        int Area = this.width * this.height;
        int Area2 = m.width * m.height;

        if (Area > Area2) {
            System.out.println(this.model + " is larger than" + m.model);
        }
        else if (Area < Area2) {
            System.out.println(this.model + " is smaller than" + m.model);
        }
        else {
            System.out.println(" Displays have equal size");
        }
        System.out.println();
    }

    public void compareSharpness(Display m) {
        if (this.ppi > m.ppi) {
            System.out.println(this.model + " is sharper than " + m.model);
        } else if (this.ppi < m.ppi) {
            System.out.println(m.model + " is sharper than " + this.model);
        } else {
            System.out.println(this.model + " and " + m.model + " have the same sharpness.");
        }
        System.out.println();
    }

    public void compareWithMonitor(Display m) {
        compareSize(m);
        compareSharpness(m);
        System.out.println();
    }
}
