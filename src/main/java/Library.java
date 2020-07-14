import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;
//    private String book;

    public Library(){
        this.stock = new ArrayList<Book>();
        this.capacity = 100;
    }


    public int bookCount() {
        return stock.size();
    }

    public void addBook(Book book) {
        if(this.stock.size() < this.capacity)
        stock.add(book);
    }

    public void removeBook() {
        if(this.stock.size() >= 1);
            stock.remove(0);
    }
}
