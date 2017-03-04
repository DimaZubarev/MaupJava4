package lesson18and19_exceptions.question;

public class BadMarkException extends Exception {
    int mark;
    public BadMarkException(int mark){
        this.mark = mark;
    }
    public String getMessage() {
        return "Bad mark " + this.mark + " to retake!";
    }
}
