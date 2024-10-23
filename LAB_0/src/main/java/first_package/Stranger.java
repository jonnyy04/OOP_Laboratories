package first_package;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.List;

public class Stranger {
    private Integer id;
    private Boolean isHumanoid;
    private String planet;
    private Integer age;
    private List<String> traits;
    private JsonNode jsonData;

    // Constructor
    public Stranger(JsonNode info) {

        if (info.has("id")) {
            this.id = info.get("id").asInt();

        } else {
            this.id = null;
        }

        if (info.has("isHumanoid")) {
            this.isHumanoid = info.get("isHumanoid").asBoolean();
        } else {
            this.isHumanoid = null;
        }

        if (info.has("planet")) {
            this.planet = info.get("planet").asText();
        } else {
            this.planet = null; // planet null dacă nu există
        }

        if (info.has("age")) {
            this.age = info.get("age").asInt();
        } else {
            this.age = null; // age este null dacă nu există
        }

        if (info.has("traits")) {
            this.traits = new ArrayList<>();
            for (JsonNode trait : info.get("traits")) {
                this.traits.add(trait.asText());
            }
        } else {
            this.traits = null; // traits este null dacă nu există
        }

        jsonData = info;
    }


    public Integer getId() {
        return id;
    }

    public Boolean getIsHumanoid() {
        return isHumanoid;
    }

    public String getPlanet() {
        return planet;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getTraits() {
        return traits;
    }

    public JsonNode getJsonData() {
        return jsonData;
    }

    @Override
    public String toString() {
        return "Lap_0_package.Stranger{" +
                "id=" + id +
                ", isHumanoid=" + isHumanoid +
                ", planet='" + planet + '\'' +
                ", age=" + age +
                ", traits=" + traits +
                '}';
    }


}
