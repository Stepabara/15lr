package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findByTitle(String title) throws BookNotFoundException {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        throw new BookNotFoundException(
                "Книга \"" + title + "\" не найдена в библиотеке", title);
    }

    public void lendBook(String title) throws BookNotFoundException, BookNotAvailableException {
        Book b = findByTitle(title);
        b.borrow();
        System.out.println("Книга \"" + b.getTitle() + "\" выдана");
    }

    public void returnBook(String title) throws BookNotFoundException {
        Book b = findByTitle(title);
        b.returnBook();
        System.out.println("Книга \"" + b.getTitle() + "\" возвращена");
    }

    public void printAll() {
        System.out.println("Список книг:");
        for (Book b : books) System.out.println("  " + b);
    }
}
