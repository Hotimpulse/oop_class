package oop_class.Seminar1.NPCs;

import java.util.Arrays;

public abstract class Npc {
    int attack;
    int defense;
    int shots;
    int[] damage;
    int health;
    int speed;
    Boolean delivery;
    Boolean magic;
    String name;

    public Npc(int attack, int defense, int shots, int[] damage, int health, int speed, Boolean delivery, Boolean magic,
            String name) {
        this.attack = attack;
        this.defense = defense;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Attack = " + attack +
                ", Def. = " + defense +
                ", Shots = " + shots +
                ", Dmg = " + Arrays.toString(damage) +
                ", HP = " + health +
                ", Spd = " + speed +
                ", Delivery = " + delivery +
                ", Magic = " + magic +
                ", Class = " + name;
    }

    public void createUnit() {
        new Monk();
        new Marksman();
        new Peasant();
        new Sniper();
        new Thief();
        new Wizard();
        new Pikeman();
    }
}