package lesson20_List.IntroGenerik;
public class BagTest {
    public static void main(String[] args) {
        Bag<Integer> bagInt = new Bag<>(5); // (5) == (new Integer(5));
        bagInt.setValue(10);
        System.out.println(bagInt);
        //bagInt.setValue("a"); // good!!! cannot add other type
        Integer a = bagInt.getValue(); // good!!! no visible casting
    }
}
