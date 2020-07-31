import model.Book;
import model.Library;
import model.Reader;

import java.util.ArrayList;
import java.util.List;

public class LibraryHelper {
    public void showAvailableBooks(Library library) {
        List<Book> availableBooks = getAvailableBooks(library);

        if (availableBooks.isEmpty()) {
            System.out.println("There is no books to show");
        } else {
            for (Book book: availableBooks) {
                System.out.println(book.getName());
            }
        }
    }

    public List<Book> getAvailableBooks(Library library) {
        List<Book> availableBooks = new ArrayList<>();

        for (Book book : library.getBooks()) {
            if (book.getReader() == null) {
                availableBooks.add(book);
            }
        }

        return availableBooks;
    }

    public void borrowBook(Library library, String title, Reader reader) {
        for (Book book : library.getBooks()) {
            if (book.getName().equals(title)) {
                if (book.getReader() == null) {
                    book.setReader(reader);
                } else {
                    System.out.println("Sorry!");
                }
            }
        }
    }
}
