package oop_class.Seminar3.chars;

import java.util.List;

public class Monk extends Base {

    public Monk(List<Base> group, int x, int y) {
        super(12, 7, 0, new int[]{-4,-4}, 30, 30, 5, false, true, "Monk");
        super.group = group;
        super.position = new Vector2(x, y);
    }
    @Override
    public void Step(List<Base> group) {
        
    }
}
