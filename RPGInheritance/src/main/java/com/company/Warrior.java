package com.company;

public class Warrior extends Weapons {

    private int shieldStrength;


    public Warrior() {}

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean arrested, boolean running, int shieldStrength ) {
        super(name, strength, health, stamina, speed, attackPower, arrested, running);

        this.setName("Ultimate");
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.setArrested(false);
        this.setRunning(false);
        this.shieldStrength = 100;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public int attackAnotherCharacter() {
        return super.attackAnotherCharacter();
    }
}
