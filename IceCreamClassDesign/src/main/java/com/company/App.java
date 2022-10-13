package com.company;

import com.company.factory.IceCream;

public class App {
    public static void main(String[] args) {
        IceCream iScreamForIce = new IceCream();

        iScreamForIce.setSalePrice(100.00);
        iScreamForIce.getSalePrice();
        iScreamForIce.sellingPoint();

        iScreamForIce.setProductionTime(6);
        iScreamForIce.getProductionTime();
        iScreamForIce.timeOff();


        iScreamForIce.setIngredients("chocolates");
        iScreamForIce.getIngredients();
        iScreamForIce.recipe();



        com.company.pointofsale.IceCream flavorLove = new com.company.pointofsale.IceCream();

        flavorLove.setFlavor("red-velvet");
        flavorLove.getFlavor();
        flavorLove.favoriteFlavor();

        flavorLove.setPrice(250.99);
        flavorLove.getPrice();
        flavorLove.expense();

        flavorLove.setQuantity(10);
        flavorLove.getQuantity();
        flavorLove.amount();

    }
}
