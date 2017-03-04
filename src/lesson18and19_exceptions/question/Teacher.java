package lesson18and19_exceptions.question;
public class Teacher extends Person{
    public Teacher(String name) {
        super(name);
    }
    public void setMark(Student s, int i){
        try {
            s.setMark(i);
        } catch (BadMarkException e) {
            System.out.println(e.getMessage());
        }
    }
}
