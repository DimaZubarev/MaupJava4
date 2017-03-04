package lesson10_data_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd G");
        System.out.println(date);
        Date date1 = new Date(5645651251565l);
        System.out.println(date1);
        System.out.println(sdf.format(date1));
        date.setTime(98798096785l);
        System.out.println(date);
    }
}
