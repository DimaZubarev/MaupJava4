package lesson12_oop_abstract_class.animals;

public class Eagle extends Bird{

    private double airSpeed;

    public Eagle(String name, double weight, boolean predator, double airSpeed) {
        super(name, weight, predator);
        this.airSpeed = airSpeed;
    }

    @Override
    public void madeEggs() {
        System.out.println("I am eagle, i made 3 eggs");
    }

    @Override
    public void eat() {
        System.out.println("I am eagle, i eat meat, an so on");
    }

    @Override
    public void sound() {
        System.out.println("Eagle sey uuuuuuu");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "airSpeed=" + airSpeed +
                "} " + super.toString();
    }
}
