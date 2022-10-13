package com.company.pointofsale;

public class IceCream {
    private String flavor;
    private double price;
    private int quantity;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void favoriteFlavor() {
        System.out.println("My favorite flavor is " + flavor );
    }

    public void expense() {
        System.out.println("The most expensive ice cream on the menu costs " + price + " dollars!");
    }

    public void amount() {
        System.out.println("We have " + quantity + " tons of ice cream in the store");
    }
}
