package lesson12_oop_abstract_class.animals;
public class Owl extends Bird{

   private int photosensitivity;

    public Owl(String name, double weight, boolean predator, int photosensitivity) {
        super(name, weight, predator);
        this.photosensitivity = photosensitivity;
    }

    @Override
    public void madeEggs() {
        System.out.println("I am owl, i made 5 eggs");
    }

    @Override
    public void eat() {
        System.out.println("I am owl, i eat meat, an so on");
    }

    @Override
    public void sound() {
        System.out.println("Owl sey uuuuuuu");
    }

    @Override
    public String toString() {
        return "Owl{" +
                "photosensitivity=" + photosensitivity +
                "} " + super.toString();
    }
}
