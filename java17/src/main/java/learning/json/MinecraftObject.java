package learning.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.NotNull;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinecraftObject {
  private static final String ITEM = "item";
  private static final ArrayList<String> NBT =
      new ArrayList<>(Arrays.asList("display", "ench", "AttributeModifiers"));
  private static final String RESULT = "result";

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
    minecraft.setItem(ITEM);
    minecraft.setResult(RESULT);
    minecraft.setNbt(NBT);
    minecraft.setTest2(serializeTest2());
    return minecraft;
  }

  public static @NotNull Test2 serializeTest2() {
    var minecraft = new Test2();
    minecraft.setBaz(serializeBaz());
    return minecraft;
  }

  public static @NotNull Baz serializeBaz() {
    var minecraft = new Baz();
    minecraft.setFoobar(List.of(serializeFoo()));
    minecraft.setHideFlags(1);
    return minecraft;
  }

  public static @NotNull Foobar serializeFoo() {
    var minecraft = new Foobar();
    minecraft.setId("1");
    minecraft.setLvl(1);
    return minecraft;
  }
}
