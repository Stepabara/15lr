package org.example;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double x, double y, double width, double height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth()  { return width; }
    public double getHeight() { return height; }
    public void setWidth(double width)   { this.width = width; }
    public void setHeight(double height) { this.height = height; }

    @Override
    public void draw() {
        System.out.println("Рисую прямоугольник");
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("  Ширина: %.2f, высота: %.2f, площадь: %.2f%n",
                width, height, calculateArea());
    }

    public boolean isSquare() {
        return width == height;
    }
}