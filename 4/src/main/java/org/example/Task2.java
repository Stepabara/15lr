package org.example;
import java.util.Scanner;

public class Task2 {
    public static void run(Scanner sc) {
        System.out.println("\nЗадание 2");
        System.out.println("Массив из 6 сотрудников: max и min зарплата");

        Employee[] employees = {
                new Employee("Иванов И.И.",   1500.00, "Программист"),
                new Employee("Петров П.П.",   2300.50, "Менеджер"),
                new Employee("Сидоров С.С.",   875.75, "Стажёр"),
                new Employee("Смирнова Е.И.", 3100.25, "Директор"),
                new Employee("Кузнецов А.А.",  990.10, "Бухгалтер"),
                new Employee("Орлова М.В.",   1850.00, "Аналитик")
        };

        System.out.println("Все сотрудники:");
        for (Employee e : employees) System.out.println("   " + e);

        // максимум
        Employee maxEmp = employees[0];
        for (Employee e : employees)
            if (e.getSalary() > maxEmp.getSalary()) maxEmp = e;

        // минимум
        Employee minEmp = employees[0];
        for (Employee e : employees)
            if (e.getSalary() < minEmp.getSalary()) minEmp = e;

        System.out.println("Максимальная зарплата: " + maxEmp);
        System.out.println("Минимальная зарплата: " + minEmp);
    }
}
