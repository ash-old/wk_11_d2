import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bookCollection;
    private Book book;
    private Library library;

    public Borrower(){
        this.bookCollection = new ArrayList<Book>();
    }

    public int bookCollectionCount() {
        return this.bookCollection.size();
    }


    public void addBookToCollection(Library library) {
        if(library.bookCount() >= 1);
        Book book = library.removeBook();
        this.bookCollection.add(book);
    }
}
