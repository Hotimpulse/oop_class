package oop_class.Seminar4.chars;
import java.util.List;

public class Peasant extends Base {

    public Peasant(List<Base> group, int x, int y) {
        super(1, 1, 0, new int [1], 1, 1, 3, true, false, "Peasant", "Stand");
        super.group = group;
        super.position = new Vector2(x, y);
    }

    @Override
    public void step(List<Base> group) {
        if (this.status.equals("Dead")) return;
        if (this.status.equals("Used")) this.status = "Stand";
    }
    
}
