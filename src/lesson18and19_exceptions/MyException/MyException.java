package lesson18and19_exceptions.MyException;

import java.util.Date;

public class MyException extends Exception{
    private String name;

    @Override
    public String getMessage(){
        return "MyException" + name + "at time " + new Date();
    }

    public MyException(String name) {
        this.name = name;
    }

    public MyException(String message, String name) {
        super(message);
        this.name = name;
    }

    public MyException(String message, Throwable cause, String name) {
        super(message, cause);
        this.name = name;
    }

    public MyException(Throwable cause, String name) {
        super(cause);
        this.name = name;
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String name) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.name = name;
    }
}
