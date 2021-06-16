package com.company;

public abstract class Player {

    private String name;
    private int damage;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Player(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;


    }
}
