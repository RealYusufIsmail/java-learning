package learning.json;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;

public class JsonObjects {
    private static final Logger logger = LoggerFactory.getLogger(JsonObjects.class);
    private static final String ITEM = "item";
    private static final String NBT = "nbt";


    public static void main(String[] args) {

        JsonElement jsonObject = new JsonObjects().serialize();

        //Displaying JSON
        try (FileWriter file = new FileWriter("java17/src/main/java/learning/json/output1.json")) {
            file.write(jsonObject.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("JSON file created: '{}'", jsonObject);
    }

    public @NotNull JsonElement serialize() {
        //Creating a JSONObject object
        JsonObject jsonObject = new JsonObject();
        //adding groups
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("item", ITEM);
        jsonObject1.addProperty("nbt", NBT);
        jsonObject.add("result", jsonObject1);
        return jsonObject;
    }
}
