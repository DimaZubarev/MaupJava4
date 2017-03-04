package lesson29_files_in_out;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class PersonInput {
    public static void main(String[] args) {
        // input - зчитування
        Person p1 = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Persons.dat"))) {
        p1 = (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(p1);
    }
}
