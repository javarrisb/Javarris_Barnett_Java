package com.company.factory;

public class IceCream {

    private String flavor;
    private double salePrice;
    private double productionCost;
    private int  productionTime;
    private String ingredients;


    public void sellingPoint() {
        System.out.println("We increase the amount of our rocky road flavor to " + salePrice + " on Sundays" );
    }

    public void timeOff() {
        System.out.println("We start production every day from " + productionTime + " until midnight");
    }

    public void recipe() {
        System.out.println("You need 5 different " + ingredients + " to make the brownie recipe");
    }
}
