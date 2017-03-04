package lesson9_oop3;

/**
 * Created by Dimon on 09.12.2016.
 */
public class Person {
    private static int id;
    static int getId(){return id;}
    // static bloc при загрузці класа
    static {
        id = 10000;
        System.out.println("Static block 1");
    }
    static {
        id = 10000;
        System.out.println("Static block 2");
    }
    private String name;
   // non-static block викликається до виклика конструктора
    {
        id++;
        System.out.println("non-static block 1");
    }
    {
        System.out.println("non-static block 2");
    }

    public Person() {
        //id++;
        System.out.println("Const 1");
    }

    public Person(String name) {
        //id++;
        this.name = name;
        System.out.println("Const 2");
    }

}
