package oop_class.Seminar2;

import java.util.List;

public class Thief extends Base {

    public Thief(List<Base> group) {
        super(8, 3, 0, new int[]{2,4}, 10, 10, 6, false, false, "Thief");
        super.group = group;
    }
    
}
