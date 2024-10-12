package just_package;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Stranger> strangers = new ArrayList<>();
        SetUniverse universeSelector = new SetUniverse();
        TraitsClassification classificationSelector = new TraitsClassification(universeSelector);


        //----------------- Read the file ---------------------------------
        ReadFile jsonData = new ReadFile();
        JsonNode data = jsonData.getData();
        //-----------------------------------------------------------------


        //------------ send the necessary info ----------------------------
        for (JsonNode strangerInfo : data) {
            Stranger el = new Stranger(strangerInfo);
            strangers.add(el);
        }
        //-------------------------------------------------------------------

        for (Stranger el : strangers) {

            if (el.getPlanet() != null) {
                switch (el.getPlanet()) {
                    case "Kashyyyk", "Endor":
                        universeSelector.selectUniverse(1, el.getJsonData()); // Star Wars
                        break;
                    case "Asgard":
                        universeSelector.selectUniverse(2, el.getJsonData()); // Marvel Universe
                        break;
                    case "Betelgeuse":
                        universeSelector.selectUniverse(3, el.getJsonData()); // Hitchhiker's Universe
                        break;
                    case "Vogsphere":
                        universeSelector.selectUniverse(3, el.getJsonData()); // Hitchhiker's Universe
                        break;
                    case "Earth":
                        universeSelector.selectUniverse(4, el.getJsonData()); // Lord of the Rings
                        break;
                    default:
                        System.out.println("Unknown universe for " + el.toString());
                        break;
                }
                continue;
            }

            if (el.getAge() != null && el.getAge() > 5000) {
                universeSelector.selectUniverse(4, el.getJsonData()); // Lord of the Rings for age > 5000
                continue;
            }

            if (el.getTraits() != null) {
                classificationSelector.sort(el);
            }
        }

        // Write the universes to their respective JSON files after every selection
        try {
            universeSelector.writeUniversesToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
