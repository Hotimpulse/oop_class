package oop_class.Seminar1.NPCs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Npc> npcs = new ArrayList<>();
        // npcs.add(new Monk());
        // npcs.add(new Marksman());
        // npcs.add(new Peasant());
        // npcs.add(new Sniper());
        // npcs.add(new Thief());
        // npcs.add(new Wizard());
        // npcs.add(new Pikeman());

        for (int i = 0; i < 50; i++) {
            npcs.add(createUnit());
        }
        getType(npcs, "Monk");
        // list.forEach(n -> System.out.println(n));
    }

    private static Npc createUnit() {
        int unit = new Random().nextInt(7);
        return switch (unit) {
            case 0 -> new Peasant();
            case 1 -> new Marksman();
            case 2 -> new Monk();
            case 3 -> new Pikeman();
            case 4 -> new Sniper();
            case 5 -> new Thief();
            default -> new Wizard();
        };
    }

    private static void getType(List<Npc> npcs, String name) {
        for (Npc npc : npcs) {
            if (npc.name == "Monk") {
                System.out.println(npc);
            }
        }
    }
}
