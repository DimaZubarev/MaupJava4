package lesson10_data_calendar.date_is_mutable;

import java.util.Date;

public class Person {
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        //return birthDate; Обережно!!! Дата має в собі метод setTime
        //return (Date)birthDate.clone(); //1
        return new Date(birthDate.getTime()); //2
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
