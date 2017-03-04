package lesson13_oop_interface.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class StudentTest {
    public static void main(String[] args) {
        Student []students = new Student[5];
        students[0]= new Student("Ivan", 4);
        students[1]= new Student("Peter", 1);
        students[2]= new Student("Taras", 3);
        students[3]= new Student("Mariya", 5);
        students[4]= new Student("Mariya", 1);

        System.out.println(Arrays.toString(students));
//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));
//        Arrays.sort(students, new ByName());
//        System.out.println(Arrays.toString(students));
//        Arrays.sort(students, new ByCourse());
//        System.out.println(Arrays.toString(students));
//        Arrays.sort(students, new ByName().reversed()); // reversed() метод що в реверсі видає наше попереднє сортування
//        System.out.println(Arrays.toString(students));
        Arrays.sort(students,Student.BY_NAME);
        System.out.println(Arrays.toString(students));
    }
}
