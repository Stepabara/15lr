package org.example;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int experience, int teamSize) {
        super(name, salary, experience);
        this.teamSize = teamSize;
    }

    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

    @Override
    public void work() {
        System.out.println("Управляет командой из " + teamSize + " человек");
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.2;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Должность: Manager, команда: " + teamSize);
    }
}