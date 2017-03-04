package lesson12_oop_abstract_class.animals;

/**
 * Created by Dimon on 15.12.2016.
 */
public class Brama extends Fish implements Swim{
    private int age;

    public Brama(String name, double weight, boolean freshwater, int age) {
        super(name, weight, freshwater);
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Bream eat worms...");
    }

    @Override
    public void sound() {
        System.out.println("Bream sey &^%^$##&*(&^%$# ");
    }

    @Override
    public void swim() {
        System.out.println("Bream swimming...");
    }
}
