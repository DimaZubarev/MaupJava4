package lesson20_List.arryslist;

import java.util.ArrayList;
import java.util.List;

public class ArreyListTest {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list);
        list.add(2,3);
        System.out.println(list);
        int i = list.get(0);
        System.out.println(i);
        list.remove(2);
        System.out.println(list);
        list.remove(new Integer(5));
        System.out.println(list);
        list.add(555);
        list.removeIf(n -> n ==555);
        System.out.println(list);
        for (Integer integer : list) {
            System.out.println(integer + " ");
        }
        list.set(0,9);
        System.out.println(list);
        System.out.println("Index of 9 = " + list.indexOf(9));

    }
}
