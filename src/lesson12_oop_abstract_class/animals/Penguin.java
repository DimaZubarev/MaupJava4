package lesson12_oop_abstract_class.animals;

public class Penguin  extends Bird implements Swim{

    private double coldRezistens;

    public Penguin(String name, double weight, boolean predator, double coldRezistens) {
        super(name, weight, predator);
        this.coldRezistens = coldRezistens;
    }

    @Override
    public void swim() {
        System.out.println("Penguin swimming...");
    }

    @Override
    public void madeEggs() {
        System.out.println("I am eagle, i made 1 eggs");
    }

    @Override
    public void eat() {
        System.out.println("Penguin eat fish...");
    }

    @Override
    public void sound() {
        System.out.println("Penguin sey  ^&$^&$$^#%#*%");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "coldRezistens=" + coldRezistens +
                "} " + super.toString();
    }
}
