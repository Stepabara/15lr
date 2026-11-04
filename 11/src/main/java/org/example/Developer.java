package org.example;

public class Developer extends Employee {
    private String language;

    public Developer(String name, double salary, int experience, String language) {
        super(name, salary, experience);
        this.language = language;
    }

    public String getLanguage() { return language; }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Должность: Developer, язык: " + language);
    }
}