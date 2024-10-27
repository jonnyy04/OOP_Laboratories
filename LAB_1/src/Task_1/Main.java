package Task_1;

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display(1920, 1080, 300.5f, "Display A");
        Display display2 = new Display(2560, 1440, 350.0f, "Display B");
        Display display3 = new Display(3840, 2160, 250.0f, "Display C");

        display1.compareSize(display2); // Compare display1 with display2
        display2.compareSharpness(display3); // Compare display2 with display3
        display1.compareWithMonitor(display3); // Compare display1 with display3
    }
}