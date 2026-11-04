package org.example;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int pages;
    private boolean available;

    public Book(String title, String author, String isbn, int pages)
            throws InvalidISBNException {

        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Название не может быть пустым");
        }
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Автор не может быть пустым");
        }
        if (pages <= 0) {
            throw new IllegalArgumentException("Количество страниц должно быть > 0");
        }
        if (!isValidISBN(isbn)) {
            throw new InvalidISBNException(
                    "Неверный формат ISBN: " + isbn + " (ожидается XXX-X-XXXX-XXXX-X)", isbn);
        }

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.available = true;
    }

    private boolean isValidISBN(String isbn) {
        if (isbn == null) return false;
        return isbn.matches("\\d{3}-\\d-\\d{4}-\\d{4}-\\d");
    }

    public String getTitle()  { return title; }
    public String getAuthor() { return author; }
    public String getIsbn()   { return isbn; }
    public int getPages()     { return pages; }
    public boolean isAvailable() { return available; }

    public void borrow() throws BookNotAvailableException {
        if (!available) {
            throw new BookNotAvailableException(
                    "Книга \"" + title + "\" уже выдана", title);
        }
        available = false;
    }

    public void returnBook() {
        available = true;
    }

    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s', isbn='%s', pages=%d, available=%b}",
                title, author, isbn, pages, available);
    }
}