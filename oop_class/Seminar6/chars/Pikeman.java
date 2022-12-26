package oop_class.Seminar6.chars;
import java.util.List;

public class Pikeman extends Base {

    public Pikeman(List<Base> group, int x, int y, int amount) {
        super(4, 5, 0, new int[]{1,3}, 10, 10, 4, false, false, "Pikeman", "Alive");
        super.group = group;
        super.position = new Vector2(x, y);
        super.amount = amount;
    }
    @Override
    public void step(List<Base> group) {
        if (this.status.equals("Dead")) return;
        
        Base target = this.getPosition().findNearest(group);
        if (getPosition().getDistance(target.getPosition()) <= 1) {
            target.takeDamage(target);
        }
        
        int x = getPosition().x;
        int y = getPosition().y;

        if (target.getPosition().y > getPosition().y && checkPosition(new Vector2(x, y++)))
            setPosition(new Vector2(x, y++));
        else if (target.getPosition().y < getPosition().y && checkPosition(new Vector2(x, y--)))
            setPosition(new Vector2(x, y--));
        else if (target.getPosition().x > getPosition().x && checkPosition(new Vector2(x, y--)))
            setPosition(new Vector2(x, y--));
        else if (target.getPosition().x < getPosition().x && checkPosition(new Vector2(x, y++)))
            setPosition(new Vector2(x, y++));
    }

    private boolean checkPosition(Vector2 position) {
        for (Base base : getGroup()) {
            if (position.isEqual(base.getPosition())) return false;
        }
        return true;
    }
}
