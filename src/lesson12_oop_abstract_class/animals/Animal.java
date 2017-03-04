package lesson12_oop_abstract_class.animals;

public abstract class Animal {
    private String name;
    private double weight;

    public abstract void eat();
    public abstract void sound();
    public String info(){
        return "We are animals";
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
