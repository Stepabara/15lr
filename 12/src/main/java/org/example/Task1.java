package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void run(Scanner sc) {

        Map<String, Product> products = new LinkedHashMap<>();

        products.put("Телевизор",  new Electronics("Телевизор", 101, 1500.0, 24));
        products.put("Ноутбук",    new Electronics("Ноутбук",   102, 2200.0, 12));
        products.put("Наушники",   new Electronics("Наушники",  103,  150.0, 6));

        products.put("Хлеб",       new Food("Хлеб",      201, 2.5,  "2026-10-20"));
        products.put("Молоко",     new Food("Молоко",    202, 3.2,  "2026-10-18"));
        products.put("Сыр",        new Food("Сыр",       203, 18.0, "2026-11-01"));

        products.put("Футболка",   new Clothing("Футболка", 301, 35.0, "M"));
        products.put("Джинсы",     new Clothing("Джинсы",   302, 90.0, "L"));

        System.out.println("\nВсе ключи и значения:");
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            System.out.println("  " + entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("\nРазмер Map: " + products.size());
        System.out.println("Содержит ключ \"Хлеб\"? " + products.containsKey("Хлеб"));
        System.out.println("Содержит значение с id=102? " +
                products.containsValue(products.get("Ноутбук")));

        System.out.println("\nТолько Electronics:");
        for (Product p : products.values()) {
            if (p instanceof Electronics) {
                System.out.println("  " + p);
            }
        }
    }
}