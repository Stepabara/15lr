package org.example;

public class BookNotAvailableException extends Exception {
    private String title;

    public BookNotAvailableException(String message, String title) {
        super(message);
        this.title = title;
    }

    public String getTitle() { return title; }
}