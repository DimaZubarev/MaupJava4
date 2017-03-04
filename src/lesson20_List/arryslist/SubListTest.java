package lesson20_List.arryslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubListTest {
    public static void main(String[] args) {
        // Лист, оснований на масиві, він задається при створенні і більше не збільшується (add - не працює)
        List<Integer> list = Arrays.asList(33,44,55);
        //list.add(10); //error!!!
        list.set(0, 11); // ok!!!
        System.out.println(list);

        Integer[]arr = {1,2,3,4,5,6};
        List<Integer> list2 = new ArrayList<>(Arrays.asList(33,44,55));
        list2.add(77);
        System.out.println(list2);

        // array -> ArrayList
        List<Integer> list3 = new ArrayList<>(Arrays.asList(arr));
        list3.add(8);
        System.out.println(list3);

        // ArrayList -> array
        Integer[] arrays = list2.toArray(new Integer[list2.size()]);
        System.out.println("Arrays = " + Arrays.toString(arrays));

        //subList 55, 66, 777
        List<Integer> sublist = list3.subList(2,5);
        System.out.println("Sub = " + sublist);
        sublist.set(0,1000);
        sublist.add(0,100000);
        System.out.println(list3);


    }
}
