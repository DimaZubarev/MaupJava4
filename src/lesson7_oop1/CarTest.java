package lesson7_oop1;
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("green");
        car.setWeight(2000);
        car.setYear(2005);

        Car car1 = new Car("red", 2000.2, 2016, 100);

        car.accelerate(10.5);
        car.printInfo();

        System.out.println("");
        System.out.println(car.getColor());
        System.out.println(car.getWeight());
        System.out.println(car.getYear());
    }
}
