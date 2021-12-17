package learning.hashmaps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Iterator;

public class MainHashMap {
  private static final Logger logger = LoggerFactory.getLogger(MainHashMap.class);

  public static void main(String[] args) {
    // HashMap implements the Map interface (need import)
    // HashMap is similar to ArrayList, but with key-value pairs
    // stores objects, need to use Wrapper Class
    // ex: (name,email),(username,userID),(country,capital)

    HashMap<String, String> countries = new HashMap<>();

    // add a key and value
    countries.put("Jordan", "Amman");
    countries.put("USA", "Washington DC");
    countries.put("India", "New Delhi");
    countries.put("China", "Beijing");
    countries.put("England", "London");
    countries.put("Japan", "Tokyo");

    // logger.info("Size of HashMap: {}", countries.size());
    // countries.remove("USA");
    // logger.info("Size of HashMap: {}", countries.size());

    // get a value
    // String capital = countries.get("Japan");
    // logger.info("Capital of Japan is {}", capital);

    // remove all
    // countries.clear();
    // logger.info("Size of HashMap: {}", countries.size());

    // replace a value
    // countries.replace("Japan", "Shanghai");
    // logger.info("Capital of Japan is {}", countries.get("Japan"));

    // iterate through HashMap
    for (String country : countries.keySet()) {
      logger.info("Country: {}", country); // country is the key
    }

    for (String capital : countries.values()) {
      logger.info("Capital: {}", capital); // capital is the value
    }

    for (String country : countries.keySet()) {
      logger.info("Country: {}, Capital: {}", country, countries.get(country));
    }

    // check if key exists
    if (countries.containsKey("England")) {
      logger.info("England is in the HashMap");
    }

    // check if value exists
    if (countries.containsValue("London")) {
      logger.info("London is in the HashMap");
    }

    // check if key-value pair exists
    if (countries.containsKey("England") && countries.containsValue("London")) {
      logger.info("England is in the HashMap");
    }
  }
}
