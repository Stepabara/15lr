package org.example;

public class BookNotFoundException extends Exception {
    private String title;

    public BookNotFoundException(String message, String title) {
        super(message);
        this.title = title;
    }

    public String getTitle() { return title; }
}