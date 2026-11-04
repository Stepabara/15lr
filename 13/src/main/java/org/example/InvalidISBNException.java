package org.example;

public class InvalidISBNException extends Exception {
    private String isbn;

    public InvalidISBNException(String message, String isbn) {
        super(message);
        this.isbn = isbn;
    }

    public String getIsbn() { return isbn; }
}