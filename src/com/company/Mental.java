package com.company;

public class Mental extends Player implements  AbilityUsable {


    public Mental(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void superAbility() {
        if(getHealth()<300 && getHealth()>0) {
            System.out.println(getName() + " used his super ability - Telekinesis!");
        } if (getHealth() < 0) {
            System.out.println(getName() + " is dead.");
        } else {
        }
    }
}
