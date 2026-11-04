package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите задание:");
        System.out.println("  1 — Файл о любимой книге + вывод информации");
        System.out.println("  2 — Ввод 10 чисел в файл + произведение");
        System.out.println("  3 — Разделение чисел на двузначные и остальные");
        System.out.println("  4 — 14 температур + средняя");
        System.out.println("  5 — Количество чисел, кратных 5");
        System.out.print("Ваш выбор: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1: Task1.task1(); break;
            case 2: Task1.task2(sc); break;
            case 3: Task1.task3(); break;
            case 4: Task1.task4(sc); break;
            case 5: Task1.task5(); break;
            default: System.out.println("Ошибка: выберите 1..5.");
        }

        sc.close();
    }
}