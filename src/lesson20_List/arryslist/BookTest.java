package lesson20_List.arryslist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dimon on 06.01.2017.
 */
public class BookTest {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Horstman", "Prog Java 1",2014));
        books.add(new Book("Horstman", "Prog Java 2",2015));
        books.add(new Book("Eckel", "Thinking in Java",2009));
        books.add(new Book("Bloch","Effective Java",2002));
        books.add(new Book("Shildt","Java SE",2010));

        System.out.println(getBooksAfterYear(books,2010));
        System.out.println(getBooksByAuthor(books, "Horstman"));
    }
    static List<Book> getBooksAfterYear(List<Book> books, int year){
        List<Book> tmp = new ArrayList<>();
        for (Book book : books) {
            if(book.getYear() >= year) tmp.add(book);
        }
        return tmp;
    }

    static List<Book> getBooksByAuthor(List<Book> books, String author){
        List<Book> tmp = new ArrayList<>();
        for (Book book : books) {
            if(book.getAuthor().equals(author))tmp.add(book);
        }
        return tmp;
    }
}
