package lesson20_List.arryslist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // Ітератор служить для перебирання коллекцій
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Iterator<Integer> itr2 = list.iterator();
        int a;
        while(itr2.hasNext()){
            a = itr2.next();
            if(a ==4)itr2.remove();
            System.out.println(list);
        }
    }
}
