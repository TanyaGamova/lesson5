public class Book {
    String name;
    String author;
    Integer serialID;
    Integer pagesCount;

    Book( String name, String author, int pagesCount ) {
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    Book( int serialID, int pagesCount ) {
        this.serialID = serialID;
        this.pagesCount = pagesCount;
    }

    Book( String name, int pagesCount ) {
        this.name = name;
        this.pagesCount = pagesCount;
    }

    @Override
    public String toString() {
        return String.format( "{Name : %s; Author : %s; serial ID : %s; Count of pages : %s}", name, author, serialID, pagesCount );
    }
}
