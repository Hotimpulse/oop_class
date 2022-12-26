package oop_class.Seminar2;

import java.util.List;

public class Sniper extends Base {

    public Sniper(List<Base> group) {
        super(12, 10, 32, new int[]{8,10}, 15, 15, 9, false, false, "Sniper");
        super.group = group;
    }
    
}
