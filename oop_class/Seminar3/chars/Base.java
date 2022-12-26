package oop_class.Seminar3.chars;

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
    protected String status;

    protected int amount;
    protected List<Base> group;
    protected Vector2 position;


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

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public int getShots() {
        return shots;
    }

    public int setShots(int shots) {
        return this.shots = shots;
    }

    public double setHealth(double maxHealth) {
        return this.maxHealth = maxHealth;
    }
    int x;
    public void getAttacked(int damage) {
        this.health -= damage; // math random * [0]
    }

    public Vector2 getPosition() {
        return position;
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

    public Object step(List<Base> darkSide) {
        return null;
    }

    public Object getStatus() {
        return null;
    }
}