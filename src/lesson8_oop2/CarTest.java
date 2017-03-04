package lesson8_oop2;
public class CarTest {
    public static void main(String[] args) {
        CarShop shop = new CarShop(5);
        shop.add(new Car("Honda", 2016));
        shop.add(new Car("BMW", 2000));
        shop.add(new Car("Opel", 2010));
        shop.add(new Car("Tesla", 2005));
        shop.add(new Car("Toyota", 2015));

 //       shop.add(new Car("Opel", 2010)); // overflow
  //      shop.delete(0);
        shop.print();

        System.out.println("Cars after year 2007:");
        shop.printFilterYear(2007);
        System.out.println("");
        shop.printFiterName('o');
        System.out.println("");
        System.out.println(shop.getAverageAge());
        System.out.println(shop.containsCar("Lada"));
//        shop.containsCar();
    }
}
