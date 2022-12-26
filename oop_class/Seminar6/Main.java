package oop_class.Seminar6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import oop_class.Seminar6.chars.Base;
import oop_class.Seminar6.chars.Marksman;
import oop_class.Seminar6.chars.Monk;
import oop_class.Seminar6.chars.Peasant;
import oop_class.Seminar6.chars.Pikeman;
import oop_class.Seminar6.chars.Sniper;
import oop_class.Seminar6.chars.Thief;
import oop_class.Seminar6.chars.Wizard;

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
                checkWhoIsAlive();
                step++;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("There's been an error lol...");
        }


    }

    public static void init() {
        lightSide = new ArrayList<>();
        darkSide = new ArrayList<>();

        int x = 1;
        int y = 1;

        for (int i = 0; i < TEAM_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    lightSide.add(new Peasant(lightSide, x++, y, 6));
                    break; 
                case 1:
                    lightSide.add(new Monk(lightSide, x++, y, 1));
                    break;
                case 2:
                    lightSide.add(new Pikeman(lightSide, x++, y, 2));
                    break;
                default:
                    lightSide.add(new Marksman(lightSide, x++, y, 2));
            }
        }

        x = 1;
        y = 10;
       
        for (int i = 0; i < TEAM_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0: 
                    darkSide.add(new Peasant(darkSide, x++, y, 6));
                    break;
                case 1: 
                    darkSide.add(new Wizard(darkSide, x++, y, 1));
                    break;
                case 2: 
                    darkSide.add(new Thief(darkSide, x++, y, 2));
                    break;
                default: 
                    darkSide.add(new Sniper(darkSide, x++, y, 2));
            }
        }
    }

    public static void getInfo() {
    }

    public static void checkWhoIsAlive() {
        List<String> deadDark = new ArrayList<>();
        List<String> deadLight = new ArrayList<>();
        for (Base unit : Main.darkSide) {
            if (unit.getStatus() == "Dead") deadDark.add(unit.toString());
        }
        if (deadDark.size() == 10) System.out.println("GAME OVER"); 
        
        for (Base unit : Main.lightSide) {
            if (unit.getStatus() == "Dead") deadLight.add(unit.toString());
        }
        if (deadLight.size() == 10) System.out.println("GAME OVER");
    } 
}
