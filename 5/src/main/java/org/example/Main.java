package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите задание:");
        System.out.println(" Задание 1)");
        System.out.println(" Задание 2");
        System.out.println(" Задание 3");
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
            case 3:
                Task3.run(sc);
                break;
            default:
                System.out.println("Ошибка: Выберите 1..3.");
        }

        sc.close();
    }
}