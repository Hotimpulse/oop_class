package oop_class.Seminar2;

import java.util.ArrayList;

public class Monk extends Npc {

    public Monk(ArrayList<Npc> group) {
        super(12, 7, 0, new int[]{-4,-4}, 30, 5, false, true, "Monk");
        super.group = group;
    }
    
}
