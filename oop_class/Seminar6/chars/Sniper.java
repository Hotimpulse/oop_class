package oop_class.Seminar6.chars;
import java.util.List;

public class Sniper extends Base {

    public Sniper(List<Base> group, int x, int y, int amount) {
        super(12, 10, 32, new int[]{8,10}, 15, 15, 9, false, false, "Sniper", "Alive");
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
            else if (unit.getName().equals("Marksman") ||
                    unit.getName().equals("Pikeman") || 
                    unit.getName().equals("Monk") || 
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
        // target.takeDamage(target);
        // this.shots--;
        // if (this.shots <= 0) {
        //     this.status = "Used";
        //     this.shots = 0;
        // }
    }
    
}
