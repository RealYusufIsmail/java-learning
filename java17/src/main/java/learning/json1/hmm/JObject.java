package learning.json1.hmm;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;

public class JObject implements IJObject {
  protected final Map<String, Object> data = new HashMap<>();
  protected final Gson gson = new GsonBuilder().create();

  @Override
  public JObject toJObject() {
    return this;
  }

  public JObject add(String key, Object value) {
    if (value instanceof IJObject)
      data.put(key, ((IJObject) value).toJObject().data);
    else if (value instanceof IJArray)
      data.put(key, ((IJArray) value).toJArray().data);
    else
      data.put(key, value);
    return this;
  }

  public String toJson() {
    return gson.toJson(data);
  }

  public String toPrettyJson() {
    return new GsonBuilder().setPrettyPrinting().create().toJson(data);
  }

  public Map<String, Object> data() {
    return data;
  }
}
