package lesson29_files_in_out;

import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    private transient int year;
    // transient - модіфікатор що скриває серіалізацію ( преобразування екземпляру класу в форму придатну для зберігання
    // в БД ,файл або відправити по мережі

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
