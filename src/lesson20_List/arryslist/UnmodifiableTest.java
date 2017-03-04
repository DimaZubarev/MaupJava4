package lesson20_List.arryslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Dimon on 10.01.2017.
 */
public class UnmodifiableTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AA");
        list.add("CD");
        list.add("EF");
        list.add("AR");
        List<String> unmodList = Collections.unmodifiableList(list); // unmodifiableList - метод що не дозволяє
        //змінювати створенний лист.
        //unmodList.add("D"); // error!
        //unmodList.add(0,"B"); // error!
        list.set(0, "CHANGED!"); // changes unmodList
        System.out.println(unmodList);

        // 100% unmod
        List<String> unmodList2 = Collections.unmodifiableList(new ArrayList<>(list));
        list.add(0, "Changed again!"); //not changes unmodList2
        System.out.println(unmodList2);
    }

}
