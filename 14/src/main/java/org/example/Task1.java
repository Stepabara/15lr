package org.example;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void task1() {
        System.out.println("\n=== Задание 1: информация о любимой книге ===");

        String path = "book.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("Название: Мастер и Маргарита\n");
            writer.write("Автор: Михаил Булгаков\n");
            writer.write("Год: 1967\n");
            writer.write("Жанр: роман\n");
            System.out.println("Файл создан: " + path);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        File file = new File(path);
        System.out.println("\nИнформация о файле:");
        System.out.println("  Имя:              " + file.getName());
        System.out.println("  Размер:           " + file.length() + " байт");
        System.out.println("  Путь:             " + file.getAbsolutePath());
        System.out.println("  Существует?       " + file.exists());
        System.out.println("  Читать можно?     " + file.canRead());
        System.out.println("  Писать можно?     " + file.canWrite());

        System.out.println("\nСодержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("  " + line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }

    public static void task2(Scanner sc) {
        System.out.println("\n=== Задание 2: 10 чисел в файл + произведение ===");

        String path = "numbers.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 1; i <= 10; i++) {
                System.out.print("  число " + i + ": ");
                int x = sc.nextInt();
                writer.write(x + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        long product = 1;
        int count = 0;
        System.out.println("\nПрочитанные числа:");
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int x = Integer.parseInt(line.trim());
                System.out.print(x + " ");
                product *= x;
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        System.out.println("\nКоличество чисел: " + count);
        System.out.println("Произведение:    " + product);
    }

    public static void task3() {
        System.out.println("\n=== Задание 3: двузначные → g.txt, остальные → h.txt ===");

        String source = "f.txt";
        String g = "g.txt";
        String h = "h.txt";

        Random rnd = new Random();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(source))) {
            for (int i = 0; i < 20; i++) {
                writer.write(rnd.nextInt(200) - 50 + "\n");
            }
            System.out.println("Файл f.txt создан со случайными числами (20 шт.)");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(source));
             BufferedWriter wg = new BufferedWriter(new FileWriter(g));
             BufferedWriter wh = new BufferedWriter(new FileWriter(h))) {

            String line;
            while ((line = reader.readLine()) != null) {
                int x = Integer.parseInt(line.trim());
                if (x >= 10 && x <= 99 || x <= -10 && x >= -99) {
                    wg.write(x + "\n");
                } else {
                    wh.write(x + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка обработки: " + e.getMessage());
            return;
        }

        System.out.println("Файлы g.txt и h.txt заполнены.");

        System.out.println("\ng.txt (двузначные):");
        printFile(g);

        System.out.println("h.txt (остальные):");
        printFile(h);
    }

    public static void task4(Scanner sc) {
        System.out.println("\n=== Задание 4: 14 температур + средняя ===");

        String path = "temperatures.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            System.out.println("Введите 14 значений температуры тела (например 36.6):");
            for (int i = 1; i <= 14; i++) {
                System.out.print("  замер " + i + ": ");
                double t = sc.nextDouble();
                writer.write(t + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        double sum = 0;
        int count = 0;
        System.out.println("\nПрочитанные температуры:");
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                double t = Double.parseDouble(line.trim());
                System.out.printf("%.2f ", t);
                sum += t;
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        System.out.printf("%nСредняя температура: %.2f%n", sum / count);
    }

    public static void task5() {
        System.out.println("\n=== Задание 5: количество чисел, кратных 5 ===");

        String path = "f5.txt";
        Random rnd = new Random();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (int i = 0; i < 10; i++) {
                writer.write((rnd.nextInt(100) - 20) + "\n");
            }
            System.out.println("Файл f5.txt создан (10 чисел)");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int count = 0;
        System.out.println("\nЧисла из файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int x = Integer.parseInt(line.trim());
                System.out.print(x + " ");
                if (x % 5 == 0) count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        System.out.println("\nКоличество чисел, кратных 5: " + count);
    }

    private static void printFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print(line + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}