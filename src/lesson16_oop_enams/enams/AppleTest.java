package lesson16_oop_enams.enams;

import java.util.Arrays;
import java.util.Comparator;

public class AppleTest {
    public static void main(String[] args) {
        Apple[] apples = Apple.values();
        for (Apple apple : apples) {
            System.out.println(apple);
        }
        System.out.println("Sorted: ");
        Arrays.sort(apples);
        for (Apple apple : apples) {
            System.out.println(apple);
        }
        System.out.println("Sorted by price: ");
        Arrays.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                //return a1.getPrice()- a2.getPrice();
                return Integer.compare(a1.getPrice(), a2.getPrice()); //
            }
        });

        System.out.println(Arrays.toString(apples));

        System.out.println("Sorted by price reversed ");
        Arrays.sort(apples, new ByPrice().reversed());
        System.out.println(Arrays.toString(apples));
    }
}
