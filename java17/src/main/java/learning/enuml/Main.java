package learning.enuml;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

enum Planet {
  MERCURY(1), VENUS(2), EARTH(3), MARS(4), JUPITER(5), SATURN(6), URANUS(7), NEPTUNE(8);

  final int number;

  Planet(int number) {
    this.number = number;
  }
}


public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    // enum = enumerated (ordered listing of items in a collection)
    // grouping of constants that behave similarly to objects
    // enumerated types are immutable

    Planet myPlanet = Planet.EARTH;

    isItInhabitable(myPlanet);
  }

  static void isItInhabitable(@NotNull Planet myPlanet) {
    switch (myPlanet) {
      case EARTH -> {
        logger.info("Earth is the only planet that we know of that is inhabited.");
        logger.info("This is planet {}", myPlanet.number);
      }
      default -> {
        logger.info("These planets are currently inhabitable.");
        logger.info("This is planet {}", myPlanet.number);
      }
    }
  }
}
