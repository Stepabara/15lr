package org.example;

public class Clothing extends Product {
    private String size;

    public Clothing(String name, int id, double price, String size) {
        super(name, id, price);
        this.size = size;
    }

    public String getSize() { return size; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(", size=%s", size);
    }

    @Override
    public String toString() {
        return "Clothing{name='" + getName() + "', id=" + getId()
                + ", price=" + getPrice() + ", size='" + size + "'}";
    }
}