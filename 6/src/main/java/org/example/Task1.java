package org.example;

import java.util.Scanner;

public class Task1 {
    public static void run(Scanner sc) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);

        System.out.println("Дробь 1: " + f1);
        System.out.println("  десятичное: " + f1.toDecimal());

        System.out.println("Дробь 2: " + f2);
        System.out.println("  десятичное: " + f2.toDecimal());

        System.out.println("Числитель f1: " + f1.getNumerator());
        System.out.println("Знаменатель f1: " + f1.getDenominator());

        f1.setNumerator(5);
        f1.setDenominator(8);
        System.out.println("После изменения: " + f1);
        System.out.println("  десятичное: " + f1.toDecimal());
    }
}