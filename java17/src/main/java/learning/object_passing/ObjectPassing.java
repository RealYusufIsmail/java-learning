package learning.object_passing;

public class ObjectPassing {
    public static void main(String[] args) {

        Garage garage = new Garage();
        Car car1 = new Car("Volvo");
        Car car2 = new Car("Honda");

        garage.park(car1);
        garage.park(car2);
    }
}
