package com.company;

public class Constable extends Weapons {

    private String jurisdiction;

    public Constable() {
    }

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean arrested, boolean running, String jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower, arrested, running);

        this.setName("Bruce");
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setAttackPower(5);
        this.setArrested(false);
        this.setRunning(false);
        this.jurisdiction = "Gotham City";

    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public boolean arrestAnotherCharacter() {
        return super.arrestAnotherCharacter();
    }


    @Override
    public int  attackAnotherCharacter() {
        return super.attackAnotherCharacter();
    }

}



