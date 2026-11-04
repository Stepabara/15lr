package org.example;

public abstract class Employee {
    private String name;
    private double salary;
    private int experience;

    public Employee(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName()      { return name; }
    public double getSalary()    { return salary; }
    public int getExperience()   { return experience; }

    public void setName(String name)          { this.name = name; }
    public void setSalary(double salary)      { this.salary = salary; }
    public void setExperience(int experience) { this.experience = experience; }

    public abstract void work();
    public abstract double calculateBonus();

    public void displayInfo() {
        System.out.printf("%s — зарплата: %.2f, стаж: %d лет%n",
                name, salary, experience);
    }
}