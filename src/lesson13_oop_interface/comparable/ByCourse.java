package lesson13_oop_interface.comparable;

import java.util.Comparator;

/**
 * Created by Dimon on 20.12.2016.
 */
public class ByCourse implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return s1.getCourse()-s2.getCourse();
    }
}
