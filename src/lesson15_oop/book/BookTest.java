package lesson15_oop.book;

import lesson13_oop_interface.comparable.ByName;

import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        Book[]books=new Book[5];
        books[0]=new Book("Abetka", "Cat", 2016);
        books[1]=new Book("Robinzon", "Dog", 2010);
        books[2]=new Book("Limpopo", "Manky", 2015);
        books[3]=new Book("Banana", "Manky", 2014);
        books[4]=new Book("Aplle", "Stiv", 2014);

        System.out.println(Arrays.toString(books));
        System.out.println("By year");
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));

        System.out.println("By name");
        Arrays.sort(books, Book.BY_NAME);
        System.out.println(Arrays.toString(books));

        System.out.println("By author");
        Arrays.sort(books, Book.BY_AUTHOR);
        System.out.println(Arrays.toString(books));

        System.out.println("By author & By name");
        Arrays.sort(books, Book.BY_AUTHOR.thenComparing(Book.BY_NAME));
        System.out.println(Arrays.toString(books));


    }
}
