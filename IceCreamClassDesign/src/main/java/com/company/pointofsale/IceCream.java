package com.company.pointofsale;

public class IceCream {
    private String flavor;
    private double price;
    private int quantity;


    public void favoriteFlavor() {
        System.out.println("My favorite flavor is  " + flavor );
    }

    public void expense() {
        System.out.println("The most expensive ice cream on the menu costs " + price + " dollars!");
    }

    public void amount() {
        System.out.println("We have " + quantity + "tons of ice cream in the store");
    }
}
