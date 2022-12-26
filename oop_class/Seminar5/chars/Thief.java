package oop_class.Seminar5.chars;
import java.util.List;

public class Thief extends Base {

    public Thief(List<Base> group, int x, int y, int amount) {
        super(8, 3, 0, new int[]{2,4}, 10, 10, 6, false, false, "Thief", "Alive");
        super.group = group;
        super.position = new Vector2(x, y);
        super.amount = amount;
    }
    @Override
    public void step(List<Base> group) {

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
        else if (target.getPosition().x > getPosition().x && checkPosition(new Vector2(x++, y)))
            setPosition(new Vector2(x++, y));
        else if (target.getPosition().x < getPosition().x && checkPosition(new Vector2(x, y--)))
            setPosition(new Vector2(x, y--));
    }

    private boolean checkPosition(Vector2 position) {
        for (Base base : getGroup()) {
            if (position.isEqual(base.getPosition())) return false;
        }
        return true;
    }
}
