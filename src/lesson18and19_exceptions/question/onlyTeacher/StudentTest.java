package lesson18and19_exceptions.question.onlyTeacher;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Alex");
        Teacher teacher = new Teacher("Bill");
            teacher.setMark(student, 4);
            student.setMark(5);
        System.out.println(student);

    }



}
