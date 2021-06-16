package com.company;

public class Main {

    public static void main(String[] args) {

        Mental oracle = new Mental("Oracle", 300, 100);
        System.out.println("Name: " + oracle.getName() + "\nDamage: " + oracle.getDamage() + "\nHealth: " + oracle.getHealth());
        oracle.superAbility();

        Warrior trollWarlord = new Warrior("Troll Warlord", 500, 150);
        System.out.println("\n\nName: " + trollWarlord.getName() + "\nDamage: " + trollWarlord.getDamage() + "\nHealth: " + trollWarlord.getHealth());
        trollWarlord.superAbility();

        Magical maiden = new Magical("Crystal Maiden", 200, 100);
        System.out.println("\n\nName: " + maiden.getName() + "\nDamage: " + maiden.getDamage() + "\nHealth: " + maiden.getHealth());
        maiden.superAbility();

    }
}
