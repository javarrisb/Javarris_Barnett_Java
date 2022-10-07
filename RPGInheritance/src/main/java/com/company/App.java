package com.company;

public class App {

    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        Constable constable = new Constable();
        Warrior warrior = new Warrior();

        warrior.attackAnotherCharacter();

        constable.arrestAnotherCharacter();

        farmer.attackAnotherCharacter();
    }
}
