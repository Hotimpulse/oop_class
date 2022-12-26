package oop_class.Seminar2;

import java.util.List;

public class Pikeman extends Base {

    public Pikeman(List<Base> group) {
        super(4, 5, 0, new int[]{1,3}, 10, 10, 4, false, false, "Pikeman");
        super.group = group;
    }
    
}
