package lesson18and19_exceptions.question.onlyTeacher;

public class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }
    public void setMark(Student s, int mark){
        s.setMark(mark);
    }

}

