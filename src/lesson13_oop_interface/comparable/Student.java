package lesson13_oop_interface.comparable;

import java.util.Comparator;

public class Student implements Comparable {
    private String name;
    private int course;
    static Comparator BY_NAME = new Comparator() {                  // анонімний клас
            @Override
            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                return s1.getName().compareTo(s2.getName());
            }
        };

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                name + '\'' +
                ", course=" + course +
                '}';
    }

    // by course
   /* @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        if(this.course>other.course)return 1;
        if(this.course<other.course)return -1;
        return 0;
    }*/

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        if (this.name == other.name) {
            return this.course - (other.course);
        }
        return this.name.compareTo(other.name);
    }
}
