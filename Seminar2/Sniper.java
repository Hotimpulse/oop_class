package oop_class.Seminar2;

import java.util.ArrayList;

public class Sniper extends Npc {

    public Sniper(ArrayList<Npc> group) {
        super(12, 10, 32, new int[]{8,10}, 15, 9, false, false, "Sniper");
        super.group = group;
    }
    
}
