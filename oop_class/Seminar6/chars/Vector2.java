package oop_class.Seminar6.chars;


import java.util.List;

public class Vector2 {

    public int x, y;

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean isEqual (Vector2 position) {
        if (position.y == y & position.x == x) return true;
        return false;
    }

    public double getDistance(Vector2 position) {
        return Math.sqrt(((position.x - this.x)^2 + (position.y - this.y)^2));
    }

    public Base findNearest(List<Base> group) {
        double distance = this.getDistance(group.get(0).getPosition());
        int nearestIndex = 0;
        for (int i = 0; i < group.size(); i++) {
            if(this.getDistance(group.get(i).getPosition()) < distance && !(group.get(i).getStatus()=="Dead")) {
                distance = this.getDistance(group.get(i).getPosition());
                nearestIndex = i;
            }
        }
        return group.get(nearestIndex);
    }

    
}
