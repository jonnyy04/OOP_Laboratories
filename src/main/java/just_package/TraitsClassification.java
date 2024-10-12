package just_package;

import java.util.List;

public class TraitsClassification extends Main {

    TraitsClassification(SetUniverse universeSelector){
        this.universeSelector = universeSelector;
    }


    SetUniverse universeSelector = new SetUniverse();


    public void sort(Stranger el) {

        List<String> traits = el.getTraits();
        for (String elem : traits) {

            if (elem.equals("EXTRA_ARMS") || elem.equals("EXTRA_HEAD") || elem.equals("GREEN")) {
                universeSelector.selectUniverse(3, el.getJsonData()); // Hitchhiker's Universe
                break;
            }

            if (elem.equals("HAIRY")) {
                universeSelector.selectUniverse(1, el.getJsonData()); // Star Wars Universe
                break;
            }

            if (elem.equals("POINTY_EARS")) {
                universeSelector.selectUniverse(4, el.getJsonData()); // Lord of the Rings
                break;
            }

            // check if Is humanoid exist --------------------
            if (el.getIsHumanoid() != null) {
                boolean isHumanoid = el.getIsHumanoid();

                switch (elem) {
                    case "SHORT":
                        if (!isHumanoid) {
                            universeSelector.selectUniverse(1, el.getJsonData()); // Star Wars Universe
                        } else {
                            universeSelector.selectUniverse(4, el.getJsonData()); // Rings Universe
                        }
                        break;
                    case "BULKY":
                        if (!isHumanoid) {
                            universeSelector.selectUniverse(3, el.getJsonData()); // Hitchhiker's Universe debug
                        } else {
                            universeSelector.selectUniverse(4, el.getJsonData()); // Lord of the Rings debug
                        }
                        break;
                    case "TALL":
                        if (!isHumanoid) {
                            universeSelector.selectUniverse(1, el.getJsonData());
                        } else {
                            universeSelector.selectUniverse(2, el.getJsonData());
                        }
                        break;
                    default:
                        System.out.println("Unknown universe for " + el.toString());
                        break;
                }
            }
        }
    }
}
