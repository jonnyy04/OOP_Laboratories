package just_package;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class SetUniverse {
    private final Universe starWars;
    private final Universe hitchhikers;
    private final Universe marvel;
    private final Universe rings;
    private final ObjectMapper mapper;

    public SetUniverse() {
        this.starWars = new Universe("starWars", new ArrayList<>());
        this.hitchhikers = new Universe("hitchHiker", new ArrayList<>());
        this.marvel = new Universe("marvel", new ArrayList<>());
        this.rings = new Universe("rings", new ArrayList<>());
        this.mapper = new ObjectMapper(); // Initialize the ObjectMapper
    }

    public void selectUniverse(int choice, JsonNode entry) {
        switch (choice) {
            case 1:
                starWars.individuals().add(entry);
                break;
            case 2:
                marvel.individuals().add(entry);
                break;
            case 3:
                hitchhikers.individuals().add(entry);
                break;
            case 4:
                rings.individuals().add(entry);
                break;
            default:
                throw new IllegalArgumentException("Invalid input");
        }
    }

    public void writeUniversesToFile() throws IOException {
        // Define the output directory for JSON files
        String outputDir = "src/output/";

        // Write each universe's individuals to their respective JSON files
        mapper.writeValue(new File(outputDir + "starWars.json"), starWars);
        mapper.writeValue(new File(outputDir + "hitchhiker.json"), hitchhikers);
        mapper.writeValue(new File(outputDir + "marvel.json"), marvel);
        mapper.writeValue(new File(outputDir + "rings.json"), rings);
    }
}

record Universe(
        String name,
        List<JsonNode> individuals
) { }
