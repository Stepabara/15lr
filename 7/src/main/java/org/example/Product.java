package org.example;

public class Product {
    private String name;
    private double price;
    private int quantity;

    private static int totalProducts = 0;
    private static double totalValue = 0.0;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        totalProducts++;
        totalValue += price * quantity;
    }

    public String getName()     { return name; }
    public double getPrice()    { return price; }
    public int    getQuantity() { return quantity; }

    public double totalCost() {
        return price * quantity;
    }

    public static double getAveragePrice() {
        if (totalProducts == 0) return 0;
        return totalValue / totalProducts;
    }

    public static int getTotalProducts() { return totalProducts; }
    public static double getTotalValue() { return totalValue; }

    @Override
    public String toString() {
        return name + " — цена: " + price + ", количество: " + quantity
                + ", стоимость: " + totalCost();
    }
}