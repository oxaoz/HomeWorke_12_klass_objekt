package lesson1;
import lesson1.Author;
public class Book {
    private String bookName;
    private Author author;
    private int publisherYear;

    public Book(String bookName, Author author, int publisherYear) {
        this.bookName = bookName;
        this.author = author;
        this.publisherYear = publisherYear;
    }

    public String toString() {
        return bookName + " " + author + " " + publisherYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book mumu = (Book) other;
        return bookName.equals(mumu.bookName) && author.equals(mumu.author) && publisherYear == mumu.publisherYear;
    }
    public int hashCode() {return java.util.Objects.hash(bookName, author, publisherYear);}
}




