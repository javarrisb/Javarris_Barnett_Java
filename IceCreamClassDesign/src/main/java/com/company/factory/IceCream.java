package com.company.factory;

public class IceCream {

    private String flavor;
    private double salePrice;
    private double productionCost;
    private int  productionTime;
    private String ingredients;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void sellingPoint() {
        System.out.println("We increase the amount of our rocky road flavor to " + salePrice + " on Sundays" );
    }

    public void timeOff() {
        System.out.println("We start production every day from " + productionTime + " until 12");
    }

    public void recipe() {
        System.out.println("You need 5 different " + ingredients + " to make the brownie recipe");
    }
}
