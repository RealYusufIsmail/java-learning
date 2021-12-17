package learning.enuml;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

enum SportCars {
  YCAR(90), FORD(100), BMW(140), AUDI(150), MERCEDES(160), LAMBORGHINI(170);

  private final int speed;

  SportCars(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return speed;
  }
}


class MainSportCar {
  private static final Logger logger = LoggerFactory.getLogger(MainSportCar.class);

  public static void main(String[] args) {
    SportCars myCar = SportCars.YCAR;

    isYourCarFast(myCar);
  }

  static void isYourCarFast(@NotNull SportCars speed) {
    logger.info(speed.getSpeed() > 100 ? "Your car is fast" : "Your car is not fast");
  }
}
