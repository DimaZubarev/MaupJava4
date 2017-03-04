package lesson21_Set;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(333);
        list.add(555);
        list.add(555);
        System.out.println("List = " + list);

        Set<Integer> set = new HashSet<>(list);
        System.out.println("Set = " + set);
        set.add(99);
        set.add(999);
        set.add(1000);
        System.out.println("Set = " + set);

        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
        System.out.println();

        set.remove(1000);
        System.out.println("Set = " + set);

        // шукає чи є такий елемент
        System.out.println("Has 555? " + set.contains(555));

        Set<Integer> set1 = new HashSet<>(Arrays.asList(555,333));
        System.out.println("Set1 = " + set1);
        System.out.println(set.removeAll(set1));
        System.out.println("After removeAll, set = " + set);
        System.out.println(set.removeAll(Collections.emptySet()));

        //[1,2,3,4,5] -> [3,2,5,14] за допомогою set
        // linkedHashSet
        Set<Integer> loto = new HashSet<>();
        Set<Integer>lotonext = new LinkedHashSet<>(5);
        loto.add(1);
        loto.add(2);
        
        loto.add(3);
        loto.add(4);
        loto.add(5);
        System.out.println(loto);
        int i = (int)(Math.random()*5+1);
        while (lotonext.isEmpty()){
            lotonext.add(i);
        }
        System.out.println(lotonext);

    }
}
