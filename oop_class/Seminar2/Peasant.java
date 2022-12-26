package oop_class.Seminar2;

import java.util.List;

public class Peasant extends Base {

    public Peasant(List<Base> group) {
        super(1, 1, 0, new int [1], 1, 1, 3, true, false, "Peasant");
        super.group = group;
    }

    @Override
    public void Step(List<Base> group) {

    }
    
}
