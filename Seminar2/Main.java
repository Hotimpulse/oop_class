package oop_class.Seminar2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Npc> light = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randNum = ((int)Math.random()*4);
            switch (randNum) {
                case 0 -> light.add(new Peasant(light));
                case 1 -> light.add(new Monk(light));
                case 2 -> light.add(new Pikeman(light));
                default -> light.add(new Marksman(light));
            }
        }
        ArrayList<Npc> dark = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randNum = ((int)Math.random()*4);
            switch (randNum) {
                case 0 -> dark.add(new Peasant(dark));
                case 1 -> dark.add(new Wizard(dark));
                case 2 -> dark.add(new Thief(dark));
                default -> dark.add(new Sniper(dark));
            }
        }
    }
}
