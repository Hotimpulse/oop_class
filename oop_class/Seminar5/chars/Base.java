package oop_class.Seminar5.chars;

import java.util.List;

import oop_class.Seminar5.Main;

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
                int speed, Boolean delivery, Boolean magic, String name, String status) {
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
        this.status = status;
        
    } 

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int[] getDamage() {
        return damage;
    }

    protected void takeDamage (Base unit) {
        unit.health -= this.getAttack() - unit.getDefense();
        if (this.health <= 0) {
            this.health = 0;
            this.status = "Dead";
        }
    }

    protected int damageValue (Base unit) {
        int flag = this.getAttack() - unit.getDefense();
        int value = 0;
        // if (flag == 0) value = ((this.getDamage()[0] + this.getDamage()[1])/2);
        if (flag > 0) value = this.getDamage()[1];
        if (flag <= 0) value = this.getDamage()[0];
        return value;
    }

    public String getName() {
        return name;
    }

    public List<Base> getGroup() {
        return group;
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

    public Vector2 getPosition() {
        return position;
    }
    
    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String getInfo() {
        return "HP = " + health + "/" + maxHealth +
                ", Class = " + name +
                ", Status = " + status;
        // return "Att. = " + attack +
        //         ", Def. = " + defense +
        //         ", Shots = " + shots +
        //         ", Dmg. = " + Arrays.toString(damage) +
        //         ", HP = " + health +
        //         ", Spd. = " + speed +
        //         ", Del. = " + delivery +
        //         ", Magic = " + magic +
        //         ", Class = " + name + 
        //         ", Status = " + status;
    }
    
    @Override
    public void step(List<Base> group) {
        
    }
}