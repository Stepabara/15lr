import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите задание:");
        System.out.println("  1 — Задание 1, пункт 4 (строка в верхнем регистре)");
        System.out.println("  2 — Задание 2, пункт 4 (самое длинное слово)");
        System.out.println("  3 — Задание 3 (Employee + Report)");
        System.out.println("  4 — Задание 4, пункт 4 (Java X)");
        System.out.print("Ваш выбор: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1: {
                System.out.println(" 1");
                System.out.println("Вывести строку в верхнем регистре");

                System.out.print("Введите строку: ");
                String s = sc.nextLine();

                System.out.println("Исходная строка: " + s);
                System.out.println("В верхнем регистре: " + s.toUpperCase());
                break;
            }

            case 2: {
                System.out.println(" 2");
                System.out.println("Найти самое длинное слово в предложении");

                System.out.print("Введите предложение: ");
                String s = sc.nextLine();

                String[] words = s.trim().split("\\s+");

                if (words.length == 0 || words[0].isEmpty()) {
                    System.out.println("Предложение пустое.");
                    return;
                }

                String longest = words[0];
                for (String w : words) {
                    if (w.length() > longest.length()) {
                        longest = w;
                    }
                }

                System.out.println("Самое длинное слово: " + longest);
                System.out.println("Его длина: " + longest.length());
                break;
            }

            case 3: {
                System.out.println(" 3");
                Employee[] employees = {
                        new Employee("Иванов И.И.",   1500.50),
                        new Employee("Петров П.П.",   2300.00),
                        new Employee("Сидоров С.С.",  1875.75),
                        new Employee("Смирнова Е.И.", 3100.25),
                        new Employee("Кузнецов А.А.",  990.10)
                };

                Report.generateReport(employees);
                break;
            }

            case 4: {
                System.out.println(" 4");
                System.out.println("Найти все подстроки \"Java X\"");

                String text = "Versions: Java 5, Java  6, Java 7, Java 8,Java   12.";
                System.out.println("Исходная строка: " + text);

                Pattern p = Pattern.compile("Java +\\d+");
                Matcher m = p.matcher(text);
                System.out.println("Найденные подстроки:");

                boolean found = false;
                while (m.find()) {
                    System.out.println("   " + m.group());
                    found = true;
                }
                if (!found) System.out.println("ошибка");
                break;
            }

            default: {
                System.out.println("Ошибка: Выберите 1..4.");
            }
        }

        sc.close();
    }
}