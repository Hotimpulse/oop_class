package oop_class.Seminar5.chars;
import java.util.List;

public class Wizard extends Base {

    public Wizard(List<Base> group, int x, int y, int amount) {
        super(17, 12, 0, new int[]{-5,-5}, 30, 30, 9, false, true, "Wizard", "Alive");
        super.group = group;
        super.position = new Vector2(x, y);
        super.amount = amount;
    }
    @Override
    public void step(List<Base> group) {
        // if (this.health < this.maxHealth) {
        //     this.health = this.setHealth(maxHealth);
        // }
        if (this.status.equals("Dead")) return;
        // for (Base unit : this.group) {
        //     if ((unit.health) < (unit.maxHealth * 0.75)) {
        //         unit.health -= this.damage[0];
        //         if (unit.health > unit.maxHealth) unit.health = unit.maxHealth;
        //     }   
        //     else if (unit.health >= (unit.maxHealth * 0.75)) {
        //         if (unit.getName().equals("Marksman") ||
        //             unit.getName().equals("Pikeman") || 
        //             unit.getName().equals("Monk") || 
        //             unit.getName().equals("Peasant")) {
        //                 unit.takeDamage(super.damageValue(unit));
        //             }
        //     }
        //     else if (unit.health <= 0) {
        //         unit.health += 1;
        //         unit.status = "Alive";
        //     } 
        // }
        // 1. Если у всех в группе здоровье выше 75% - маг стреляет в противника. Вне зависимости от атаки, брони и расстояния повреждение равно силе магии
        // 2. Если у кого то в группе здоровье меньше 75% - маг лечит.
        // 3. Маг может возраждать, но у возраждённого всего одно здоровье!
        for (Base unit : this.group) {
            if (unit.getName().equals("Marksman") ||
                unit.getName().equals("Pikeman") || 
                unit.getName().equals("Monk")) {
                if ((unit.health) >= (unit.maxHealth * 0.75)) {
                    unit.takeDamage(unit);
                }else if (unit.health <= 0) {
                    unit.health += 1;
                    unit.status = "Alive";
                }else if (unit.health != 0 && unit.health < unit.maxHealth) {
                    unit.health -= this.damage[0];
                }else if (unit.health > unit.maxHealth) {
                    unit.health = unit.maxHealth;
                }  
            }
        }
    }
}
