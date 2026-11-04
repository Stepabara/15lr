package org.example;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String author;
    private int popularity;
    private List<Integer> readerRatings;

    public Book(int id, String title, String author, int popularity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.popularity = popularity;
        this.readerRatings = new ArrayList<>();
    }

    public int getId()             { return id; }
    public String getTitle()       { return title; }
    public String getAuthor()      { return author; }
    public int getPopularity()     { return popularity; }
    public List<Integer> getRatings() { return readerRatings; }

    public void setPopularity(int popularity) { this.popularity = popularity; }

    public void addRating(int rating) {
        readerRatings.add(rating);
    }

    public double getAverageRating() {
        if (readerRatings.isEmpty()) return 0.0;
        int sum = 0;
        for (int r : readerRatings) sum += r;
        return (double) sum / readerRatings.size();
    }

    @Override
    public String toString() {
        return String.format("Book{id=%d, title='%s', author='%s', popularity=%d, avg=%.2f}",
                id, title, author, popularity, getAverageRating());
    }
}