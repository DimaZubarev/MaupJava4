package lesson8_oop2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}

    public int getAge() {return age;}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    static int compareByAge(Person p1, Person p2){
        if(p1.age < p2.age ) return -1;
        if(p1.age > p2.age ) return 1;
        return 0;
    }

    public boolean isOlderThan(Person that) {
//        if (this.age > that.age) return true;
//        return false;
        return this.age > that.age; // спрощенний варіант
    }
}
