import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;


    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library();
        book = new Book();
    }

    @Test
    public void countBookCollection(){
        assertEquals(0, borrower.bookCollectionCount());
    }

    @Test
    public void addBookToCollection(){
        borrower.addBookToCollection(library);
        assertEquals(1, borrower.bookCollectionCount());
    }


}
