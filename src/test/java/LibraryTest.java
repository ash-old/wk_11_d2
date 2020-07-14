import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

     private Library library;
     private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book();
    }

    @Test
    public void countBooksInLibrary(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBookToStock(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void removeBookFromStock(){
        library.addBook(book);
        library.addBook(book);
        library.removeBook();
        assertEquals(1, library.bookCount());
    }

//    @Test
//    public void checkCapacityBeforeAddingBook(){
//        library.addBook(book);
//        assertEquals(1, library.bookCount());
//    }






}
