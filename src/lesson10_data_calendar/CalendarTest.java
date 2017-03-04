package lesson10_data_calendar;

import java.text.DateFormatSymbols;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar(2016,11,13);
        // в цьому календарі потрібно вказувати місяць з - 1, тобто грудень це 11 місяць, а 0 це січень.
        System.out.println(calendar);
        System.out.println(calendar.get(GregorianCalendar.YEAR));
        System.out.println(calendar.get(GregorianCalendar.MONTH));
        System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println(calendarToString(calendar));

        calendar.add(GregorianCalendar.DATE, 60); // + 60 днів до теперьошньої дати
        System.out.println(calendarToString(calendar));

        calendar.add(GregorianCalendar.MONTH, 1); // +1 місяць до теперьошньої дати
        System.out.println(calendarToString(calendar));

        Date date = calendar.getTime();
        System.out.println(date);

        DateFormatSymbols df = new DateFormatSymbols();
        String[]days = df.getWeekdays();
        for (String day : days) {
            System.out.println(day);
        }
        System.out.println("");

        String[] months = df.getMonths();
        for (String month : months) {
            System.out.println(month);
        }

    }
    static String calendarToString(GregorianCalendar calendar){
        return calendar.get(GregorianCalendar.YEAR) + "." +
                (calendar.get(GregorianCalendar.MONTH) + 1) + "." +
                calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
