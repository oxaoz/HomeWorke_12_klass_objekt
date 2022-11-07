public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
    public String getAuthor() {
       return nameAuthor + " " + surnameAuthor;
    }
    //public String toString() {
       //return "Автор " + nameAuthor + " " + surnameAuthor;
    //}
}

