package oop_class.Seminar2;

import java.util.List;

public class Marksman extends Base {

    public Marksman(List<Base> group) {
        super(6, 3, 16, new int[]{2,3}, 10, 10, 4, false, false, "Marksman");
        super.group = group;
    }
    

}
