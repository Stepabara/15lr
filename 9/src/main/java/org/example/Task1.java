package org.example;

import java.util.Scanner;

public class Task1 {
    public static void run(Scanner sc) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Иванов И.И.",   5000, 8, 10);
        employees[1] = new Manager("Петров П.П.",   4800, 6,  7);
        employees[2] = new Developer("Сидоров С.С.", 3500, 3, "Java");
        employees[3] = new Developer("Кузнецов А.А.", 4000, 5, "Python");
        employees[4] = new Developer("Орлова М.В.",   3800, 4, "C++");

        System.out.println("\nВсе сотрудники");
        for (Employee e : employees) {
            e.displayInfo();
            e.work();
            System.out.printf("  Бонус: %.2f%n%n", e.calculateBonus());
        }


        for (Employee e : employees) {
            if (e instanceof Manager) {
                Manager m = (Manager) e;
                System.out.println("Manager: команда из " + m.getTeamSize());
            } else if (e instanceof Developer) {
                Developer d = (Developer) e;
                System.out.println("Developer: язык " + d.getLanguage());
            }
        }
    }
}