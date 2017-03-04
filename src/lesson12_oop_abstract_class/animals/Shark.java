package lesson12_oop_abstract_class.animals;

public class Shark extends  Fish implements Swim{
    private int teethCount;

    public Shark(String name, double weight, boolean freshwater, int teethCount) {
        super(name, weight, freshwater);
        this.teethCount = teethCount;
    }

    @Override
    public void eat() {
        System.out.println("Shark eat meet, other fishes...");
    }

    @Override
    public void sound() {
        System.out.println("Shark sey (^&$^&$$^#%#*%");
    }

    @Override
    public void swim() {
        System.out.println("Shark swimming...");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "teethCount=" + teethCount +
                '}';
    }
}
