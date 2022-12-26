package oop_class.Seminar2;

import java.util.Arrays;
import java.util.List;

public abstract class Base implements BaseInterface {
    protected int attack;
    protected int defense;
    protected int shots;
    protected int[] damage;

    protected double health;
    protected double maxHealth;

    protected int speed;
    protected Boolean delivery;
    protected Boolean magic;
    protected String name;
    // private String status;
    protected int amount;
    protected List<Base> group;


    public Base(int attack, int defense, int shots, int[] damage, double health, double maxHealth,
                int speed, Boolean delivery, Boolean magic, String name) {
        this.attack = attack;
        this.defense = defense;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.maxHealth = maxHealth;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.name = name;
    } 

    public int[] getDamage() {
        return damage;
    }

    public double getHealth(){
        return health;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public double setHealth(double maxHealth) {
        return this.maxHealth = maxHealth;
    }
    int x;
    public void getAttacked(int damage) {
        this.health -= damage; // math random * [0]
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
    public void Step(List<Base> group) {
        
    }
    int index;
    @Override
    public void hasNext(){
        return this.health < 10;
    }   
}