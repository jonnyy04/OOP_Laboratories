package Task_3;

import Task_1.Display;
import java.util.ArrayList;
import java.util.List;

public class Assistant {
    private String assistantName;
    private List<Display> assignedDisplays;

    // Constructor
    public Assistant(String assistantName) {
        this.assistantName = assistantName;
        this.assignedDisplays = new ArrayList<>();
    }

    // Adds a Display object to the assignedDisplays list
    public void assignDisplay(Display d) {
        assignedDisplays.add(d);
    }

    // Iterates through assignedDisplays list, comparing each Display with the next
    public void assist() {
        for (int i = 0; i < assignedDisplays.size(); i++) {
            Display currentDisplay = assignedDisplays.get(i);

            for (int j = i + 1; j < assignedDisplays.size(); j++) { // Start from the next element
                Display otherDisplay = assignedDisplays.get(j);

                System.out.println("\nComparing " + currentDisplay.getModel() + " with " + otherDisplay.getModel());
                System.out.println("-------------------------------------------------");
                currentDisplay.compareWithMonitor(otherDisplay);
                System.out.println("-------------------------------------------------");
            }
        }
    }


    // Removes a Display from the list and returns it
    public Display buyDisplay(Display d) {
        if (assignedDisplays.remove(d)) {
            return d;
        } else {
            System.out.println("Display not found.");
            return null;
        }
    }
}

