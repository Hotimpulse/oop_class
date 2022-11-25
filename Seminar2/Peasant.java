package oop_class.Seminar2;

import java.util.ArrayList;

public class Peasant extends Npc {

    public Peasant(ArrayList<Npc> group) {
        super(1, 1, 0, new int [1], 1, 3, true, false, "Mark");
        super.group = group;
    }
    
}
