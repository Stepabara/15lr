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

        for (int i = 0; i < tasks.length - 1; i++) {
            for (int j = 0; j < tasks.length - 1 - i; j++) {
                if (tasks[j].getPriority().ordinal() < tasks[j + 1].getPriority().ordinal()) {
                    Task temp = tasks[j];
                    tasks[j] = tasks[j + 1];
                    tasks[j + 1] = temp;
                }
            }
        }

        System.out.println("\nЗадачи после сортировки (HIGH → LOW):");
        for (Task t : tasks) System.out.println("   " + t);
    }
}