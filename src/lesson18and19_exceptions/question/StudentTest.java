package lesson18and19_exceptions.question;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Alex");
        try {
            student.setMark(5);
        } catch (BadMarkException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(student);
    }



}
