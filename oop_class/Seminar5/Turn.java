package oop_class.Seminar5;

import java.util.HashMap;
import java.util.List;

import oop_class.Seminar5.chars.Base;

public class Turn extends Main {

    private static HashMap<Integer, List<String>> wave = new HashMap<>();
    // fighters, wizards, shooters, peasants

    public static void orderByClass() {
        if (Main.step == 0) {
            wave.put(0, List.of("Thief", "Pikeman"));
            wave.put(1, List.of("Sniper", "Marksman"));
            wave.put(2, List.of("Monk", "Wizard"));
            wave.put(3, List.of("Peasant"));

            for (int i = 0; i < wave.size(); i++) {
                steps(lightSide, darkSide, wave.get(i));
            }
        } else {
            for (int i = 0; i < wave.size(); i++) {
                steps(lightSide, darkSide, wave.get(i));
            }
        }
    }

    private static void steps(List<Base> group1, List<Base> group2, List<String> wave) {
        for (Base unit : group1) {
            if (!(unit.getStatus().equals("Dead")) && wave.contains(unit.getName()))
                unit.step(group2);
        }
        for (Base unit : group2) {
            if (!(unit.getStatus().equals("Dead")) && wave.contains(unit.getName()))
                unit.step(group1);
        }
    }
}
