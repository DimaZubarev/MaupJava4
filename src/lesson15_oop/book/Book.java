package lesson15_oop.book;

import java.util.Comparator;

public class Book implements Comparable <Book>{
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    static Comparator <Book> BY_NAME = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.getName().compareTo(b2.getName());
        }
    };

    static Comparator <Book> BY_AUTHOR = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.getAuthor().compareTo(b2.getAuthor());
        }
    };


    @Override
    public int compareTo(Book that) {
        return this.getYear()-that.getYear();
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
