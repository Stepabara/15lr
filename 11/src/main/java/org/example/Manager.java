package org.example;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int experience, int teamSize) {
        super(name, salary, experience);
        this.teamSize = teamSize;
    }

    public int getTeamSize() { return teamSize; }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.2;   // 20% — у менеджера
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Должность: Manager, команда: " + teamSize);
    }
}