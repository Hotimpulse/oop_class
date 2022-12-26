package oop_class.Seminar2;

import java.util.List;

public class Monk extends Base {

    public Monk(List<Base> group) {
        super(12, 7, 0, new int[]{-4,-4}, 30, 30, 5, false, true, "Monk");
        super.group = group;
    }
    
}
