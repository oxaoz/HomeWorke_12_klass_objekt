package lesson1;
public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
    public String toString() {return  nameAuthor + " " + surnameAuthor;}
    public String getNameAuthor() {return nameAuthor;}
    public String getSurnameAuthor() {return surnameAuthor;}

    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        if (this == other) {
            return true;
        }
        Author iTurgenev = (Author) other;
        return nameAuthor.equals(iTurgenev.nameAuthor) && surnameAuthor.equals(iTurgenev.surnameAuthor);
    }

    @Override
    public int hashCode() {return java.util.Objects.hash(nameAuthor, surnameAuthor);}
}

