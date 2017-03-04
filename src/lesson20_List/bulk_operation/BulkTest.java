package lesson20_List.bulk_operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkTest {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4));
        List<Integer> listB = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7, 8));
        List<Integer> listС, listD, listE;

        System.out.println("listA = " + listA);
        System.out.println("listB = " + listB);

        listС = new ArrayList<>(listA); // листС прийняв в себе листА
        listС.removeAll(listB); // removeAll - видаляє з листаC значення які є в листіВ
        System.out.println("listC = A\\B = " + listС);

        listD = new ArrayList<>(listA);
        listD.retainAll(listB); // retainAll - видає числа які зустрічаються в листіД з листаВ
        System.out.println("listD = A intersect B " + listD);

        listE = new ArrayList<>(listA);
        listE.addAll(listB); // об'єднує два листа
        System.out.println("listE = A + B = " + listE);
    }
}
