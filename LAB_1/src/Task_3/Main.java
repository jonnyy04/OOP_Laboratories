package Task_3;

import Task_1.Display;

public class Main {
    public static void main(String[] args) {
        // Create 5 Display objects
        Display display1 = new Display(1920, 1080, 326, "Model A");
        Display display2 = new Display(2560, 1440, 401, "Model B");
        Display display3 = new Display(1280, 720, 294, "Model C");
        Display display4 = new Display(3840, 2160, 513, "Model D");
        Display display5 = new Display(1366, 768, 267, "Model E");

        // Create an Assistant instance
        Assistant assistant = new Assistant("Tech Assistant");

        // Assign displays to the assistant
        assistant.assignDisplay(display1);
        assistant.assignDisplay(display2);
        assistant.assignDisplay(display3);
        assistant.assignDisplay(display4);
        assistant.assignDisplay(display5);

        // Use the assist method to compare all assigned displays
        System.out.println("Comparing all displays:");
        assistant.assist();

        // Demonstrate the buyDisplay method by removing a display
        System.out.println("\nAttempting to buy (remove) Display Model C:");
        Display boughtDisplay = assistant.buyDisplay(display3);

        // Check if the display was successfully bought and print the result
        if (boughtDisplay != null) {
            System.out.println("Successfully bought " + boughtDisplay.getModel());
        } else {
            System.out.println("Failed to buy the display.");
        }

        // Call assist again to show the updated list of comparisons after removing a display
        System.out.println("\nComparing remaining displays after buying one:");
        assistant.assist();
    }
}
