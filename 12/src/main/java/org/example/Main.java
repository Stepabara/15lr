package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите задание:");
        System.out.println("  1 — Задание 1");
        System.out.println("  2 — Задание 2");
        System.out.print("Ваш выбор: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                Task1.run(sc);
                break;
            case 2:
                Task2.run(sc);
                break;
            default:
                System.out.println("Ошибка: такого варианта нет. Выберите 1 или 2.");
        }

        sc.close();
    }
}