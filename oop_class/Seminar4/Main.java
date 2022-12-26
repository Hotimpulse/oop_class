package oop_class.Seminar4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import oop_class.Seminar4.chars.Base;
import oop_class.Seminar4.chars.Marksman;
import oop_class.Seminar4.chars.Monk;
import oop_class.Seminar4.chars.Peasant;
import oop_class.Seminar4.chars.Pikeman;
import oop_class.Seminar4.chars.Sniper;
import oop_class.Seminar4.chars.Thief;
import oop_class.Seminar4.chars.Wizard;

public class Main {

    public static final int TEAM_SIZE = 10;
    public static int step = 0;

    public static List<Base> lightSide;

    public static List<Base> darkSide;

    public static void main(String[] args) {
        init();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                ConsoleView.view();
                System.out.println("Press ENTER");
                sc.nextLine();
                Turn.orderByClass();
                step++;
            }
        }
        catch (Exception e) {
            System.out.println("There's been an error lol...");
        }

    }

    private static void init() {
        lightSide = new ArrayList<>();
        darkSide = new ArrayList<>();

        int x = 1;
        int y = 1;

        for (int i = 0; i < TEAM_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    lightSide.add(new Peasant(lightSide, x++, y));
                    break; 
                case 1:
                    lightSide.add(new Monk(lightSide, x++, y));
                    break;
                case 2:
                    lightSide.add(new Pikeman(lightSide, x++, y));
                    break;
                default:
                    lightSide.add(new Marksman(lightSide, x++, y));
            }
        }

        x = 1;
        y = 10;
       
        for (int i = 0; i < TEAM_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0: 
                    darkSide.add(new Peasant(darkSide, x++, y));
                    break;
                case 1: 
                    darkSide.add(new Wizard(darkSide, x++, y));
                    break;
                case 2: 
                    darkSide.add(new Thief(darkSide, x++, y));
                    break;
                default: 
                    darkSide.add(new Sniper(darkSide, x++, y));
            }
        }
    }

    public static void getInfo() {
    }
}
