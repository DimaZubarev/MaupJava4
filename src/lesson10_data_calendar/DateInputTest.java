package lesson10_data_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateInputTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy"); // клас, через який ми задаємо вигляд часу
        Date date;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        date = sdf.parse(s);
        System.out.println(date);
    }
}
