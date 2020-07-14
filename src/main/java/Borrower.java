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


    public void addBookToCollection(Book book) {
//        if(library.bookCount() >= 1);
//        library.removeBook();
        this.bookCollection.add(book);
    }
}
