package oop_class.Seminar3.chars;
import java.util.List;

public class Thief extends Base {

    public Thief(List<Base> group, int x, int y) {
        super(8, 3, 0, new int[]{2,4}, 10, 10, 6, false, false, "Thief");
        super.group = group;
        super.position = new Vector2(x, y);
    }
    @Override
    public void Step(List<Base> group) {
        
    }
    
}
