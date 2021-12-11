package learning.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    Minecraft minecraft = serialize();

    // Java objects to File
    try (FileWriter writer = new FileWriter("java17/src/main/java/learning/json/test.json")) {
      gson.toJson(minecraft, writer);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static @NotNull Minecraft serialize() {
    var minecraft = new Minecraft();
    minecraft.setItem("test");
    minecraft.setNbt("{\"test\":\"test\"}");
    minecraft.setRecipe();
    return minecraft;
  }
}
