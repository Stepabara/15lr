package org.example;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double x, double y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public void draw() {
        System.out.println("Рисую круг");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;   // π·r²
    }

    @Override
    public void displayInfo() {
        super.displayInfo();                // вызываем базовый метод
        System.out.printf("  Радиус: %.2f, площадь: %.2f%n",
                radius, calculateArea());
    }

    public double getDiameter() {
        return 2 * radius;
    }
}
