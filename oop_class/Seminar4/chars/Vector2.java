package oop_class.Seminar4.chars;


import java.util.List;

public class Vector2 {

    public int x,y;

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean isEqual (Vector2 pos) {
        if (pos.y == y & pos.x == x) return true;
        return false;
    }

    public double getDistance(Vector2 pos) {
        return Math.sqrt(((pos.x - this.x)^2 + (pos.y - this.y^2)));
    }

    public Base findNearest(List<Base> group) {
        double distance = this.getDistance(group.get(0).getPosition());
        int nearestIndex = 0;
        for (int i = 0; i < group.size(); i++) {
            if(this.getDistance(group.get(i).getPosition()) < distance && !(group.get(i).status.equals("Dead"))) {
                distance = this.getDistance(group.get(i).getPosition());
                nearestIndex = i;
            }
        }
        return group.get(nearestIndex);
    }
}
