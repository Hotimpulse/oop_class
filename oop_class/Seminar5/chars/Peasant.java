package oop_class.Seminar5.chars;

import java.util.List;

public class Peasant extends Base {

    public Peasant(List<Base> group, int x, int y, int amount) {
        super(1, 1, 0, new int[1], 1, 1, 3, true, false, "Peasant", "Stand");
        super.group = group;
        super.position = new Vector2(x, y);
        super.amount = amount;
    }

    @Override
    public void step(List<Base> group) {

        if (this.status.equals("Dead"))
            return;
        if (this.status.equals("Used"))
            this.status = "Stand";
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
            if (position.isEqual(base.getPosition()))
                return false;
        }
        return true;
    }

}