package lesson8_oop2;

import lesson8_oop2.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Dima", 33);
        Person p2 = new Person("Anya", 28);

        if (Person.compareByAge(p1, p2) > 0) {
            System.out.println(p1.getName() + " is older than " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is younger than " + p2.getName());
        }

        System.out.println(p1.isOlderThan(p2));
    }
}