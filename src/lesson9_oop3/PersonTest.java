package lesson9_oop3;
public class PersonTest {
    static {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        System.out.println(Person.getId());
        Person p1 = new Person("Bob");
        Person p2 = new Person("Bim");
        Person p3 = new Person();
        System.out.println(Person.getId());
    }
}
