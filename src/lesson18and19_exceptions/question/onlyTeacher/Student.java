package lesson18and19_exceptions.question.onlyTeacher;

public class Student extends Person {
    private int mark;

    public Student(String name) {
        super(name);
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        String callerName;
        try {
            throw new Exception();
        } catch (Exception e) {
            StackTraceElement[] elements = e.getStackTrace();
            callerName = elements[1].getClassName();
            //System.out.println(callerName);
        }
        if(callerName.substring(callerName.lastIndexOf(".")+1).equals("Teacher"))
        this.mark = mark;
    }
    @Override
    public String toString() {
        return "Student{" + getName() + ", " +
                "mark = " + getMark() +
                "} " + super.toString();
    }
}
