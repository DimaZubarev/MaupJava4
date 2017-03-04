package lesson16_oop_enams.enams;

import java.util.Comparator;

public enum Apple {
    JONATHAN(10), GOLDEN(15), RED(9), CORTLAND(20);
    private int price;

    Apple(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Apple{" + name() +
                "(" + price + ")" +
                "} ";
    }
}
