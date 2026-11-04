package org.example;

public class Shape {
    private String color;
    private double x;
    private double y;

    public Shape(String color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getColor() { return color; }
    public double getX()     { return x; }
    public double getY()     { return y; }

    public void setColor(String color) { this.color = color; }
    public void setX(double x)         { this.x = x; }
    public void setY(double y)         { this.y = y; }

    public void draw() {
        System.out.println("Рисую фигуру");
    }

    public double calculateArea() {
        return 0.0;
    }

    public void displayInfo() {
        System.out.printf("Фигура: цвет=%s, координаты=(%.1f; %.1f)%n", color, x, y);
    }

    @Override
    public String toString() {
        return "Shape{color='" + color + "', x=" + x + ", y=" + y + "}";
    }
}