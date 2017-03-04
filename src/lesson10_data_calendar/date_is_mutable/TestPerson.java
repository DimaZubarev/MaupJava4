package lesson10_data_calendar.date_is_mutable;

import java.util.Date;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Dima",new Date(437028674648l));
        System.out.println(person);
        Date temp = person.getBirthDate();
        temp.setTime(0);
        System.out.println(person);
    }

}
