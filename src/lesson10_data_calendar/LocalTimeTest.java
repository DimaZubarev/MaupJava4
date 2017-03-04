package lesson10_data_calendar;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(15,27);
        LocalTime time1 = time.plusHours(1).plusMinutes(30);
        System.out.println(time1);
    }
}

