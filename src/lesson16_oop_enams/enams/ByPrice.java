package lesson16_oop_enams.enams;

import java.util.Comparator;

public class ByPrice implements Comparator<Apple> {
    @Override
    public int compare(Apple a1, Apple a2) {
        return Integer.compare(a1.getPrice(), a2.getPrice());
    }
}
