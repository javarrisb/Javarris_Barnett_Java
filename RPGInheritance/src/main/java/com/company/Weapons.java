package com.company;

import java.util.Objects;

public class Weapons {

    private String name;

    private int strength;

    private int health;

    private int stamina;

    private int speed;

    private int attackPower;

    private boolean arrested;

    private boolean running;

    public Weapons(String name, int strength, int health, int stamina, int speed, int attackPower, boolean arrested, boolean running) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.arrested = arrested;
        this.running = running;
    }

    public Weapons() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapons weapons = (Weapons) o;
        return getStrength() == weapons.getStrength() && getHealth() == weapons.getHealth() && getStamina() == weapons.getStamina() && getSpeed() == weapons.getSpeed() && getAttackPower() == weapons.getAttackPower() && isArrested() == weapons.isArrested() && isRunning() == weapons.isRunning() && Objects.equals(getName(), weapons.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStrength(), getHealth(), getStamina(), getSpeed(), getAttackPower(), isArrested(), isRunning());
    }

    public int  attackAnotherCharacter() {
        System.out.println("Here is an attack by");
        return strength;
    }

    public boolean arrestAnotherCharacter() {
        System.out.println("Here is an arrest by ");
        return arrested;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public String toString() {
        return "Weapons{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", arrested=" + arrested +
                ", running=" + running +
                '}';
    }
}
