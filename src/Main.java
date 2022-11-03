public class Main {
    public static void main(String[] args) {
        String bookM = "MUMU";
        String writerNameM = "Ivan Turgenev";
        int publisherYerM = 2002;

        String bookK = "Kolobok";
        String writerNameK = "Russian People";
        int publisherYearK = 1993;


        String [] names = {"MUMU", "Kolobok"};
        String[] writerNames = {"Ivan Turgenev", "Russian People"};
        int[] publisherYears = {2002, 1993};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Книга - " + names[i] + ", автора " + writerNames[i] + ", издана в " + publisherYears[i] + " году.");
        }
        }

    }
