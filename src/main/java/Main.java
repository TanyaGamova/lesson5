import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[4];
        books[0] = new Book( "Prestuplenie i nakazanie", "F. Dostoevsky", 672 );
        books[1] = new Book( 17085, 127 );
        books[2] = new Book( "Repka", 15 );
        books[3] = new Book( "Taras Bulba", "N. Gogol", 352 );

        Reader reader = new Reader();

        Book choice = reader.choiceBook( books );
        reader.readBook( choice );
        reader.rateBook( choice );
    }
}
