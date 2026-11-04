package org.example;

import java.util.Scanner;

public class Task1 {
    public static void run(Scanner sc) {
        Library library = new Library();

        try {
            library.addBook(new Book("Война и мир", "Толстой",      "978-3-16-148410-0", 1300));
            library.addBook(new Book("Преступление и наказание", "Достоевский", "978-0-14-044913-6", 670));
            library.addBook(new Book("Мастер и Маргарита", "Булгаков", "978-5-04-116170-6", 480));
        } catch (InvalidISBNException e) {
            System.out.println("Ошибка ISBN: " + e.getMessage());
            System.out.println("  проблемный ISBN: " + e.getIsbn());
        }

        library.printAll();

        System.out.println("\n Выдача ");
        try {
            library.lendBook("Война и мир");
        } catch (BookNotFoundException | BookNotAvailableException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n Повторная выдача ");
        try {
            library.lendBook("Война и мир");
        } catch (BookNotFoundException | BookNotAvailableException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n Несуществующая книга ");
        try {
            library.lendBook("Атлант расправил плечи");
        } catch (BookNotFoundException | BookNotAvailableException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n Возврат ");
        try {
            library.returnBook("Война и мир");
        } catch (BookNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n Неверный ISBN ");
        try {
            Book broken = new Book("Тест", "Автор", "12345", 100);
        } catch (InvalidISBNException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n Итоговое состояние ");
        library.printAll();
    }
}