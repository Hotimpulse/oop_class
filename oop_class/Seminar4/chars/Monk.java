package oop_class.Seminar4.chars;

import java.util.List;

public class Monk extends Base {

    public Monk(List<Base> group, int x, int y) {
        super(12, 7, 0, new int[] { -4, -4 }, 30, 30, 5, false, true, "Monk", "Alive");
        super.group = group;
        super.position = new Vector2(x, y);
    }

    @Override
    public void step(List<Base> group) {
        if (this.status.equals("Dead")) return;
        double mostDamaged = this.getGroup().get(0).getMaxHealth() -
                this.getGroup().get(0).getHealth();
            int mostDamagedInd = 0;
            for (int i = 1; i < this.getGroup().size(); i++) {
                if ((this.getGroup().get(i).getMaxHealth() -
                        this.getGroup().get(i).getHealth()) > mostDamaged) {
                    mostDamaged = this.getGroup().get(i).getMaxHealth() -
                            this.getGroup().get(i).getHealth();
                    mostDamagedInd = i;
                }
            }
        this.getGroup().get(mostDamagedInd).takeDamage(this.getDamage()[0]);
        this.getGroup().get(mostDamagedInd).status = "stand";
    }
}
