package oop_class.Seminar6.chars;

import java.util.List;

public class Monk extends Base {

    public Monk(List<Base> group, int x, int y, int amount) {
        super(12, 7, 0, new int[] { -4, -4 }, 30, 30, 5, false, true, "Monk", "Alive");
        super.group = group;
        super.position = new Vector2(x, y);
        super.amount = amount;
    }

    @Override
    public void step(List<Base> group) {
        // if (this.status.equals("Dead")) return;
        // double mostDamaged = this.getGroup().get(0).getMaxHealth() -
        //         this.getGroup().get(0).getHealth();
        // int mostDamagedInd = 0;
        // for (int i = 1; i < this.getGroup().size(); i++) {
        //     if ((this.getGroup().get(i).getMaxHealth() -
        //             this.getGroup().get(i).getHealth()) > mostDamaged) {
        //         mostDamaged = this.getGroup().get(i).getMaxHealth() -
        //                 this.getGroup().get(i).getHealth();
        //         mostDamagedInd = i;
        //         }
        //     }
        // this.getGroup().get(mostDamagedInd).takeDamage(this.getDamage()[0]);
        // this.getGroup().get(mostDamagedInd).status = "Stand";
        if (this.status.equals("Dead")) return;
        
        // 1. Если у всех в группе здоровье выше 75% - маг стреляет в противника. Вне зависимости от атаки, брони и расстояния повреждение равно силе магии
        // 2. Если у кого то в группе здоровье меньше 75% - маг лечит.
        // 3. Маг может возраждать, но у возраждённого всего одно здоровье!
        
        for (Base unit : this.group) {
            if (unit.getName().equals("Sniper") ||
                unit.getName().equals("Thief") || 
                unit.getName().equals("Wizard") ||
                unit.getName().equals("Peasant")) {
                if ((unit.health) >= (unit.maxHealth * 0.75)) {
                    unit.takeDamage(unit);
                }else if (unit.health <= 0) {
                    unit.health += 1;
                    unit.status = "Alive";
                }else if (unit.health != 0 && unit.health < unit.maxHealth ) {
                    unit.health -= this.attack;
                    
                }else if (unit.health > unit.maxHealth) {
                    unit.health = unit.maxHealth;
                }
            }
        }
    }
}
