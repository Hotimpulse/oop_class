package oop_class.Seminar3.chars;
import java.util.List;

public class Pikeman extends Base {

    public Pikeman(List<Base> group, int x, int y) {
        super(4, 5, 0, new int[]{1,3}, 10, 10, 4, false, false, "Pikeman");
        super.group = group;
        super.position = new Vector2(x, y);
    }
    @Override
    public void Step(List<Base> group) {
        
    }
}
