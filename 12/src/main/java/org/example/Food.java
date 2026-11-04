package org.example;

public class Food extends Product {
    private String expirationDate;

    public Food(String name, int id, double price, String expirationDate) {
        super(name, id, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() { return expirationDate; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(", expirationDate=%s", expirationDate);
    }

    @Override
    public String toString() {
        return "Food{name='" + getName() + "', id=" + getId()
                + ", price=" + getPrice() + ", expirationDate='" + expirationDate + "'}";
    }
}