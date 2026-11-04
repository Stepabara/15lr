package org.example;

import java.util.Scanner;

public class Task1 {
    public static void run(Scanner sc) {

        Product p1 = new Product("Хлеб",      25.50, 10);
        Product p2 = new Product("Молоко",    42.00,  5);
        Product p3 = new Product("Сыр",      180.00,  2);
        Product p4 = new Product("Колбаса",  250.00,  3);

        System.out.println("Созданные товары:");
        System.out.println("   " + p1);
        System.out.println("   " + p2);
        System.out.println("   " + p3);
        System.out.println("   " + p4);

        System.out.println("   Всего товаров: " + Product.getTotalProducts());
        System.out.println("   Общая стоимость: " + Product.getTotalValue());

        System.out.println("\nСредняя цена: " + Product.getAveragePrice());
    }
}
