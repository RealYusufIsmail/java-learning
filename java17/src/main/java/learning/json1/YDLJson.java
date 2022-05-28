package learning.json1;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.StringReader;

public class YDLJson {
  private YDLJson() {}

  static final Gson gson = new Gson();

  /**
   * Parses a String into a {@link JsonObject}.
   *
   * @param input string to parse
   * @return JsonObject
   */
  public static @Nullable JsonObject parseObject(String input) {
    return gson.fromJson(createReader(input), JsonObject.class);
  }

  public static @Nullable JsonArray parseArray(String input) {
    final JsonReader reader = createReader(input);
    if (reader == null) {
      return null;
    } else {
      return gson.fromJson(reader, JsonArray.class);
    }
  }

  public static @Nullable String parseClass(@NotNull Object value) {
    return gson.toJson(value);
  }

  private static <T> @Nullable JsonReader createReader(final @Nullable String input) {
    if (input == null) {
      return null;
    }

    return new JsonReader(new StringReader(input));
  }
}
