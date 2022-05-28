package learning.json1.hmm;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class JArray implements IJArray {
  protected final List<Object> data = new ArrayList<>();
  protected final Gson gson = new GsonBuilder().create();

  @Override
  public JArray toJArray() {
    return this;
  }

  public JArray add(Object value) {
    if (value instanceof IJArray)
      data.add(((IJArray) value).toJArray());
    else if (value instanceof IJObject)
      data.add(((IJObject) value).toJObject());
    else
      data.add(value);
    return this;
  }

  public JArray addAll(@NotNull Collection<?> values) {
    values.forEach(this::add);
    return this;
  }

  public JArray addAll(@NotNull JArray values) {
    return addAll(values.data);
  }
}
