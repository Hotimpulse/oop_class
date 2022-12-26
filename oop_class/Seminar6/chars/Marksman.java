package oop_class.Seminar6.chars;
import java.util.List;

public class Marksman extends Base {

    public Marksman(List<Base> group, int x, int y, int amount) {
        super(6, 3, 16, new int[]{2,3}, 10, 10, 4, false, false, "Marksman", "Alive");
        super.group = group;
        super.position = new Vector2(x, y);
        super.amount = amount;
    }
    
    @Override
    public void step(List<Base> group) {
        if (this.status.equals("Dead")) return;
        for (Base unit : group) {
            if (unit.getName().equals("Peasant") && 
                unit.status.equals("Stand")) {
                this.shots++;
                unit.status = "Used";
            }
            else if (unit.getName().equals("Sniper") ||
                    unit.getName().equals("Thief") || 
                    unit.getName().equals("Wizard") || 
                    unit.getName().equals("Peasant")) {
                        unit.takeDamage(unit);
                        this.shots--;
                        if (this.shots <= 0) {
                            this.status = "Used";
                            this.shots = 0;
                        }
                } 
        }
        // Base target = this.getPosition().findNearest(group);
        // double distance = this.getPosition().getDistance(target.getPosition());
        // target.takeDamage(distance < this.getSpeed() ?
        // super.damageValue(target) : 
        // (super.damageValue(target)/2));
        
    }
}
