package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void run(Scanner sc) {

        List<Book> books = new ArrayList<>();

        books.add(makeBook(1, "Война и мир",     "Толстой",    3, 5, 4, 5));
        books.add(makeBook(2, "Преступление",    "Достоевский",4, 5, 5, 5));
        books.add(makeBook(3, "Мастер и Маргарита","Булгаков",  5, 5, 4, 5));
        books.add(makeBook(4, "Отцы и дети",     "Тургенев",   2, 2, 3, 2));
        books.add(makeBook(5, "Герой времени",   "Лермонтов",  3, 4, 4, 3));
        books.add(makeBook(6, "Мёртвые души",    "Гоголь",     2, 2, 1, 2));
        books.add(makeBook(7, "Анна Каренина",   "Толстой",    4, 4, 4, 5));
        books.add(makeBook(8, "Тихий Дон",       "Шолохов",    5, 5, 5, 4));

        System.out.println("\nИсходный список:");
        books.forEach(b -> System.out.println("  " + b));

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            if (it.next().getAverageRating() < 3) it.remove();
        }
        System.out.println("\nПосле удаления книг со средним рейтингом < 3:");
        books.forEach(b -> System.out.println("  " + b));

        for (Book b : books) {
            if (b.getAverageRating() >= 4) {
                b.setPopularity(b.getPopularity() + 1);
            }
        }
        System.out.println("\nПосле повышения популярности (avg >= 4):");
        books.forEach(b -> System.out.println("  " + b));

        System.out.println("\nКниги с популярностью = 6:");
        printBooks(books, 6);

        books.sort(
                Comparator.comparingDouble(Book::getAverageRating).reversed()
                        .thenComparing(Book::getTitle)
        );

        System.out.println("\nОтсортированный список (по рейтингу ↓, затем по названию):");
        for (Book b : books) {
            System.out.printf("  id=%d, название='%s', средний рейтинг=%.2f%n",
                    b.getId(), b.getTitle(), b.getAverageRating());
        }
    }

    private static Book makeBook(int id, String title, String author,
                                 int popularity, int... ratings) {
        Book b = new Book(id, title, author, popularity);
        for (int r : ratings) b.addRating(r);
        return b;
    }

    private static void printBooks(List<Book> books, int popularity) {
        for (Book b : books) {
            if (b.getPopularity() == popularity) {
                System.out.println("  " + b);
            }
        }
    }
}