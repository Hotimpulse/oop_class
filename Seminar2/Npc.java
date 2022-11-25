package oop_class.Seminar2;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Npc implements BaseInterface {
    protected int attack;
    protected int defense;
    protected int shots;
    protected int[] damage;
    protected int health;
    protected int speed;
    protected Boolean delivery;
    protected Boolean magic;
    protected String name;
    protected ArrayList<Npc> group;

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
    public String getInfo() {
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
    
    @Override
    public void Step(){

    }
}