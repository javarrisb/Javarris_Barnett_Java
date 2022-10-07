package com.company;

import java.util.Objects;

public class Farmer extends Weapons {

    private boolean plowing;
    private boolean harvesting;

    public Farmer() {}

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean arrested, boolean running, boolean plowing, boolean harvesting) {
        super(name, strength, health, stamina, speed, attackPower, arrested, running);
        this.setName("Joe");
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
        this.setArrested(false);
        this.setRunning(false);
        this.plowing = false;
        this.harvesting = false;

    }

    @Override
    public int attackAnotherCharacter() {
        return super.attackAnotherCharacter();
    }
}

