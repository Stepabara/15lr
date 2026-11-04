package org.example;

public class Electronics extends Product {
    private int warranty;   // гарантия в месяцах

    public Electronics(String name, int id, double price, int warranty) {
        super(name, id, price);
        this.warranty = warranty;
    }

    public int getWarranty() { return warranty; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(", warranty=%d мес.", warranty);
    }

    @Override
    public String toString() {
        return "Electronics{name='" + getName() + "', id=" + getId()
                + ", price=" + getPrice() + ", warranty=" + warranty + "}";
    }
}
