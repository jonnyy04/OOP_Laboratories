import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Stranger> strangers = new ArrayList<>();

//----------------- Create universes---------------------------------
        Universe starWars = new Universe("starWars", new ArrayList<>());
        Universe hitchhikers = new Universe("hitchHiker", new ArrayList<>());
        Universe marvel = new Universe("marvel", new ArrayList<>());
        Universe rings = new Universe("rings", new ArrayList<>());
//-----------------------------------------------------------------



//----------------- Read the file ---------------------------------
        ReadFile jsonData = new ReadFile();
        //jsonData.showData();
        JsonNode data = jsonData.getData();
//-----------------------------------------------------------------


        for(JsonNode strangerInfo :data){
            Stranger el = new Stranger(strangerInfo);
            strangers.add(el);
        }
        for (Stranger el:strangers){
            System.out.println(el.getId());
        }
    }
}

record Universe(
        String name,
        List<JsonNode> individuals
) { }

// sonarLint

// verifica planeta
//            if (el.getPlanet() != null){
//        switch (el.getPlanet()) {
//        case "Kashyyk":
//        case "Endor":
//classificationValue = 1;
//        break;
//        case "Asgard":
//classificationValue = 2;
//        break;
//        case "BETELGEUSE":
//classificationValue = 3;
//        break;
//        case "Vogsphere":
//classificationValue = 4;
//        break;
//        case "Earth":
//classificationValue = 5;
//        break;
//default:
//classificationValue = 0;
//        break;
//        }
//        }