package learning.json1;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import learning.json1.hmm.JArray;
import learning.json1.hmm.JObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JsonRunner {
  // logger
  private static final org.slf4j.Logger logger =
      org.slf4j.LoggerFactory.getLogger(JsonRunner.class);

  public static void main(String[] args) {
    var json = new JObject().add("name", "John").add("age", new JArray().add(1)).toJson();

    logger.info("json: {}", json);
  }
}
