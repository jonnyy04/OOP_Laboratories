import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class ReadFile {
    public ReadFile() throws IOException {}
    ObjectMapper mapper = new ObjectMapper();
    File input = new File("src/main/resources/input.json");
    JsonNode data = mapper.readTree(input).get("data");

    public void showData(){
        for(JsonNode element: data){
            System.out.println(element);
        }
    }

    public JsonNode getData(){
        return(this.data);
    }

}