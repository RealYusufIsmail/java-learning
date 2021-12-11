package learning.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.NotNull;

import java.io.FileWriter;
import java.io.IOException;

public class MinecraftObject {
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
    minecraft.setRecipe(ITEM, NBT);
    return minecraft;
  }
}
