public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("+-----------------+------------+");
        System.out.printf("| %-15s | %10s |%n", "Фамилия", "Зарплата");
        System.out.println("+-----------------+------------+");

        for (Employee e : employees) {
            // %-15s — фамилия слева, 15 символов
            // %10.2f — зарплата справа, 2 знака после запятой
            System.out.printf("| %-15s | %10.2f |%n",
                    e.getFullname(), e.getSalary());
        }

        System.out.println("+-----------------+------------+");
    }
}