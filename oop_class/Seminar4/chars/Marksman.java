package oop_class.Seminar4.chars;
import java.util.List;

public class Marksman extends Base {

    public Marksman(List<Base> group, int x, int y) {
        super(6, 3, 16, new int[]{2,3}, 10, 10, 4, false, false, "Marksman", "Alive");
        super.group = group;
        super.position = new Vector2(x, y);
    }
    
    @Override
    public void step(List<Base> group) {
        
        for (Base unit : this.group) {
            if (unit.getName().equals("Peasant") && 
                unit.status.equals("Stand")) {
                this.shots++;
                unit.status = "Used";
                break;
            }
        }
        Base target = this.getPosition().findNearest(group);
        double distance = this.getPosition().getDistance(target.getPosition());
        target.takeDamage(distance < this.getSpeed() ?
        super.damageValue(target) : 
        (super.damageValue(target)/2));
        this.shots--;
        if (this.shots <= 0) {
            this.status = "Used";
            this.shots = 0;
        }
    }
}
