package oop_class.Seminar3.chars;
import java.util.List;

public class Marksman extends Base {

    public Marksman(List<Base> group, int x, int y) {
        super(6, 3, 16, new int[]{2,3}, 10, 10, 4, false, false, "Marksman");
        super.group = group;
        super.position = new Vector2(x, y);
    }
    
    @Override
    public void Step(List<Base> group) {
        for (Base unit : this.group) {
            if (unit.getName().equals("Peasant") && 
                unit.status.equals("stand")) {
                this.shots++;
                unit.status = "used";
                break;
            }
        }
        if (this.shots > 0) this.shots--;
    }

}
