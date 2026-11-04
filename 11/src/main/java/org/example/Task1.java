package org.example;

import java.util.Scanner;

public class Task1 {
    public static void run(Scanner sc) {
        System.out.println("\nПерегрузка");
        Employee e = new Employee("Иванов И.И.", 3000, 5);

        e.work();
        e.work(8);
        e.work("Лабораторная №11");

        System.out.println("\nПереопределение");

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Иванов И.И.",   3000, 5);
        employees[1] = new Manager("Петров П.П.",    5000, 8, 10);
        employees[2] = new Developer("Сидоров С.С.", 4000, 4, "Java");

        for (Employee emp : employees) {
            emp.displayInfo();

            System.out.printf("  Бонус: %.2f%n%n", emp.calculateBonus());
        }

        System.out.println("Демонстрация: перегрузка на базовом и подклассе");

        Manager m = new Manager("Кузнецов А.А.", 6000, 10, 5);
        m.work();
        m.work(10);
        m.work("Автоматизация");


        System.out.println("\ninstanceof + приведение типов ");
        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                Manager mgr = (Manager) emp;
                System.out.println(mgr.getName() + " — команда из " + mgr.getTeamSize() + " человек");
            } else if (emp instanceof Developer) {
                Developer dev = (Developer) emp;
                System.out.println(dev.getName() + " — язык " + dev.getLanguage());
            } else {
                System.out.println(emp.getName() + " — обычный сотрудник");
            }
        }
    }
}