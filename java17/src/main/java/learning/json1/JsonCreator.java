package learning.json1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonCreator implements Json {
  JsonCreator() {}

  private static final Map<String, Object> map = new HashMap<>();

  private static final Gson gson = new GsonBuilder().create();


  @Contract("_, _ -> new")
  public @NotNull JsonCreator add(@NotNull String key, @NotNull Object value) {
    map.put(key, value);
    return this;
  }

  public <T> JsonCreator add(@NotNull String key, @NotNull List<T> value) {
    map.put(key, value);
    return this;
  }

  public <T, K> JsonCreator add(@NotNull String key, @NotNull Map<T, K> value) {
    map.put(key, value);
    return this;
  }

  public String toJson() {
    return gson.toJson(map);
  }

  @Override
  public JsonCreator creator() {
    return this;
  }
}

