package lesson12_oop_abstract_class.animals;

public abstract class Bird extends Animal{
    private boolean predator;
    public abstract void madeEggs();

    public Bird(String name, double weight, boolean predator) {
        super(name, weight);
        this.predator = predator;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "predator=" + predator +
                "} " + super.toString();
    }
}
