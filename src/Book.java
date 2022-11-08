public class Book {
    private String bookName;
     private Author author;
     private int publisherYear;

    public Book(String bookName, Author author, int publisherYear) {
        this.bookName = bookName;
        this.author = author;
        this.publisherYear = publisherYear;
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

}


