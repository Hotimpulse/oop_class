package oop_class.Seminar2;

import java.util.ArrayList;

public class Pikeman extends Npc {

    public Pikeman(ArrayList<Npc> group) {
        super(4, 5, 0, new int[]{1,3}, 10, 4, false, false, "Pikeman");
        super.group = group;
    }
    
}
