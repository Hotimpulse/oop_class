package oop_class.Seminar2;

import java.util.ArrayList;

public class Thief extends Npc {

    public Thief(ArrayList<Npc> group) {
        super(8, 3, 0, new int[]{2,4}, 10, 6, false, false, "Thief");
        super.group = group;
    }
    
}
