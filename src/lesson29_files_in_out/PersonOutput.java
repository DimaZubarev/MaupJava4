package lesson29_files_in_out;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonOutput {
    public static void main(String[] args) {
        // Output - записування
        Person p1 = new Person("Tom", 30);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Persons.dat"))) {
            oos.writeObject(p1); // запис об'єкта
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}