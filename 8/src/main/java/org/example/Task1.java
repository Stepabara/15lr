package org.example;

import java.util.Scanner;

public class Task1 {
    public static void run(Scanner sc) {
        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle("Красный", 1, 1, 5);
        shapes[1] = new Circle("Зелёный", 3, 4, 2.5);
        shapes[2] = new Circle("Синий",   0, 0, 7);
        shapes[3] = new Rectangle("Чёрный", 2, 2, 4, 6);
        shapes[4] = new Rectangle("Белый",  5, 5, 3, 3);

        System.out.println("\nВсе фигуры");
        for (Shape s : shapes) {
            s.draw();                 // вызовется метод подкласса
            s.displayInfo();          // тоже подкласса
            System.out.println();
        }

        for (Shape s : shapes) {
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.printf("Circle: диаметр = %.2f%n", c.getDiameter());
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.printf("Rectangle: квадрат? %b%n", r.isSquare());
            }
        }
    }
}