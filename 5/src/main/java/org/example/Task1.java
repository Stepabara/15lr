package org.example;

import java.util.Scanner;

public class Task1 {
    public static void run(Scanner sc) {
        System.out.println("\nЗадание 1");

        Point p1 = new Point(3, 4);
        Point p2 = new Point(0, 0);

        System.out.println("Точка 1: " + p1);
        System.out.println("Точка 2: " + p2);
        System.out.println("Расстояние: " + p1.distanceTo(p2));
    }
}