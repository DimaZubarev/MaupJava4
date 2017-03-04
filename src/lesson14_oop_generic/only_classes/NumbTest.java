package lesson14_oop_generic.only_classes;
public class NumbTest {
    public static void main(String[] args) {
        Numb a = new Numb(5);
        Numb b = new Numb(7);
        Numb c = new Numb(4);
        Numb d = a.plus(b).minus(c);
        System.out.println(d);
    }
}
