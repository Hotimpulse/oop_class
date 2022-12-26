package oop_class.Seminar4.chars;
import java.util.List;

public class Sniper extends Base {

    public Sniper(List<Base> group, int x, int y) {
        super(12, 10, 32, new int[]{8,10}, 15, 15, 9, false, false, "Sniper", "Alive");
        super.group = group;
        super.position = new Vector2(x, y);
    }

    @Override
    public void step(List<Base> group) {
        
    }
    
}
