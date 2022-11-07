public class Main {
    public static void main(String[] args) {
        Author iTurgenev = new Author("Ivan", "Turgenev");
        Book mumu = new Book("Mumu", iTurgenev,2002);

        System.out.println("Book - " + mumu.getBookName());
        System.out.println("Author - " + iTurgenev.getAuthor());
        System.out.println("Publication year - " + mumu.getPublisherYear());
        mumu.setPublisherYear(2020);
        System.out.println("New publication year = " + mumu.getPublisherYear());

        System.out.println();
        Author RP = new Author("Russian", "People");
        Book repka = new Book("Repka", RP,1993);

        System.out.println("Book - " + repka.getBookName());
        System.out.println("Author - " + RP.getAuthor());
        System.out.println("Publication year - " + repka.getPublisherYear());
        repka.setPublisherYear(1999);
        System.out.println("New edition = " + repka.getPublisherYear());

    }
}
