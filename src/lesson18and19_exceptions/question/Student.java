package lesson18and19_exceptions.question;
public class Student extends Person{
    private int mark;

    public Student(String name) {
        super(name);
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) throws BadMarkException {
        this.mark = mark;
        if(mark<=2) throw new BadMarkException(mark);
    }

    @Override
    public String toString() {
        return "Student{" + getName() + ", " +
                "mark = " + getMark() +
                "} " + super.toString();
    }
}
