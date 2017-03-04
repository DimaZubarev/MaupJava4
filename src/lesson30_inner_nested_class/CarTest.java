package lesson30_inner_nested_class;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("BMW", "V6", 750);
        System.out.println(car);
        // Car.Engine eng = new Car.Engine(); // Error!!! Engine is inner! no nested!
        // Car.Engine tmp = car.new Engine("ABS", 333); // not popular
        Car.Info info = new Car.Info();
        info.printInfo();
    }
}
