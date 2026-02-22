import java.util.ArrayList;

public class Library {

    private String libraryName;
    private ArrayList<Book> bookList;

    Library(String libraryName) {
        this.libraryName = libraryName;
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("You have added " + book.getTitle() + " by " + book.getAuthor() +" to your collection.");
    }

    public ArrayList<Book> findAvailableBooks() {
        ArrayList<Book> availableBooks = new ArrayList<>();
        for(Book b : bookList) {
            if (b.isAvailable()) {
                availableBooks.add(b);
            }
        }
        return availableBooks;
    }

    public void printAvailableBooks() {
        System.out.println("Available Books: ");
        ArrayList<Book> availableBooks = findAvailableBooks();
        for(Book b : availableBooks) {
            System.out.println(b.toString());
        }
    }

    public void printAllBooks() {
        System.out.println("List of books in library: ");
        for(Book b : bookList) {
            System.out.println(b.toString());
        }

    }

    public Book findBookByTitle(String title) {
        for(Book b : bookList) {
            if(b.getTitle().equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }
}
