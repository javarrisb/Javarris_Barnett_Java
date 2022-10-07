package com.company;

import com.company.factory.IceCream;

public class App {
    public static void main(String[] args) {
        IceCream iScreamForIce = new IceCream();

        iScreamForIce.sellingPoint();

        iScreamForIce.timeOff();

        iScreamForIce.recipe();



        com.company.pointofsale.IceCream flavorLove = new com.company.pointofsale.IceCream();

        flavorLove.favoriteFlavor();

        flavorLove.expense();

        flavorLove.amount();

    }
}
