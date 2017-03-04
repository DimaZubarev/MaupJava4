package lesson20_List.IntroGenerik;

public class Bag <T>{
    private T value;

    public Bag(T input) {
        this.value = input;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "value=" + value +
                '}';
    }
}
