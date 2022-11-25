package oop_class.Seminar2;

import java.util.ArrayList;

public class Wizard extends Npc {

    public Wizard(ArrayList<Npc> group) {
        super(17, 12, 0, new int[]{-5,-5}, 30, 9, false, true, "Wizard");
        super.group = group;
    }
    
}
