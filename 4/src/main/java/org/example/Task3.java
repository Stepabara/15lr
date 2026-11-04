package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void run(Scanner sc) {
        System.out.println("\nЗадание 3");
        System.out.println("Enum Priority + сортировка задач по приоритету");

        Task[] tasks = {
                new Task("Помыть посуду",      Priority.LOW),
                new Task("Сдать лабораторную", Priority.HIGH),
                new Task("Позвонить маме",     Priority.MEDIUM),
                new Task("Купить хлеб",        Priority.HIGH),
                new Task("Полить цветы",       Priority.LOW)
        };

        System.out.println("Задачи до сортировки:");
        for (Task t : tasks) System.out.println("   " + t);

        // Сортировка по убыванию приоритета: HIGH → MEDIUM → LOW
        Arrays.sort(tasks, (a, b) ->
                b.getPriority().ordinal() - a.getPriority().ordinal());

        System.out.println("\nЗадачи после сортировки (HIGH → LOW):");
        for (Task t : tasks) System.out.println("   " + t);
    }
}