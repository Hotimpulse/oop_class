package oop_class.Seminar2;

import java.util.ArrayList;
import java.util.List;

public class Wizard extends Base {

    public Wizard(List<Base> group) {
        super(17, 12, 0, new int[]{-5,-5}, 30, 30, 9, false, true, "Wizard");
        super.group = group;
    }
    @Override
    public void Step(List<Base> group) {
        if (this.health < this.maxHealth) {
            this.health = this.setHealth(maxHealth);
        }else{
            System.out.println("Your health is full: " + this.health);
        }
    }
}
