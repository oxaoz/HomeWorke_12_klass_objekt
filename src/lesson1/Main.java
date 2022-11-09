package lesson1;

import lesson1.Author;
import lesson1.Book;

public class Main {
    public static void main(String[] args) {

        Author iTurgenev = new Author("Ivan", "Turgenev");
        Book mumu = new Book("Mumu", iTurgenev,2002);

        System.out.println("lesson1.Book - " + mumu.getBookName());
        System.out.println("lesson1.Author - " + mumu.getAuthor());
        System.out.println("Publication year - " + mumu.getPublisherYear());
        mumu.setPublisherYear(2020);
        System.out.println("New publication year = " + mumu.getPublisherYear());

        System.out.println();
        Author RP = new Author("Russian", "People");
        Book repka = new Book("Repka", RP,1993);

        System.out.println("lesson1.Book - " + repka.getBookName());
        System.out.println("lesson1.Author - " + repka.getAuthor());
        System.out.println("Publication year - " + repka.getPublisherYear());
        repka.setPublisherYear(1999);
        System.out.println("New edition = " + repka.getPublisherYear());

        System.out.println(iTurgenev.equals(RP));
        System.out.println(mumu.equals(repka));
        System.out.println(mumu.hashCode());
        System.out.println(repka.hashCode());
    }
}
