package lesson12_oop_abstract_class.animals;

public abstract class Fish extends Animal implements Swim{

    private boolean freshwater;

    public Fish(String name, double weight, boolean freshwater) {
        super(name, weight);
        this.freshwater = freshwater;
    }


}
