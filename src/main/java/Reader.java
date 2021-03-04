import java.util.Random;

public class Reader {
    public Book choiceBook( Book[] books ) {
        if (books == null || books.length == 0)
            return null;

        Random random = new Random();
        return books[random.nextInt(books.length)];
    }

    public void readBook( Book book ) {
        System.out.println( book != null ? book.toString() : "Invalid book" );
    }

    public void rateBook( Book book ) {
        if ( book == null )
        {
            System.out.println( "Invalid book" );
            return;
        }

        Random rdm = new Random();

        int bookRate = 0;
        bookRate += book.name != null ? book.name.length() : -rdm.nextInt();
        bookRate += book.author != null ? book.author.length() : -rdm.nextInt();
        bookRate += book.serialID != null ? -book.serialID : -rdm.nextInt();
        bookRate += book.name != null ? book.pagesCount : -rdm.nextInt();

        System.out.println( String.format( "Book %s has rate %s", book.name != null ? book.name : "Unnamed", bookRate ) );
    }
}