package lesson23_equels;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TestEquals {
    public static void main(String[] args) {
       /* List<Product> list = new ArrayList<>();
        list.add(new Product("Bread", 10));
        list.add(new Product("Bread", 10));
        System.out.println("List = " + list);
        System.out.println(list.contains(new Product("Bread", 10)));*/

        Set<Product> set = new LinkedHashSet<>();
        set.add(new Product("Bread", 10));
        set.add(new Product("Bread", 10));
        System.out.println("Set = " + set);
        System.out.println(set.contains(new Product("Bread", 10)));
    }
}
