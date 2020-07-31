import model.Book;
import model.Genre;
import model.Library;
import model.Reader;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library("Hacker Lib", "Bolderaja");

        library.addBook(new Book("How to be dead", "Dmitry", Genre.COMEDY));
        library.addBook(new Book("How to buy Hlebushek", "USSR", Genre.CRIME));
        library.addBook(new Book("Dance, bebbbi, dance", "Alice", Genre.ROMAN));

        for (Book book : library.getBooks()) {
            System.out.println(book.getName());
        }

        Reader maks = new Reader("Max", "Maxovichs", "help@me.lv");

        LibraryHelper helper = new LibraryHelper();
        helper.showAvailableBooks(library);
        helper.borrowBook(library, "How to buy Hlebushek", maks);

        helper.showAvailableBooks(library);


    }
}
