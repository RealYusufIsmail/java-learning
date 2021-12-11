package learning.encapsulation;

public class Encapsulation {
  public static void main(String[] args) {


    Car car = new Car("Tesla", "Y", 2021);

    System.out.println(car.getMake());
    System.out.println(car.getModel());
    System.out.println(car.getYear());

    car.setYear(2022);
  }
}
