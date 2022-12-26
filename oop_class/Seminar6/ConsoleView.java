package oop_class.Seminar6;

import java.util.Collections;
import oop_class.Seminar6.chars.Vector2;

public class ConsoleView {

    public static int step = 0;

    private static final String top10 = formatDiv("a")
            + String.join("", Collections.nCopies(9, formatDiv("-b")))
            + formatDiv("-c");
    private static final String mid10 = formatDiv("d")
            + String.join("", Collections.nCopies(9, formatDiv("-e")))
            + formatDiv("-f");
    private static final String bottom10 = formatDiv("g")
            + String.join("", Collections.nCopies(9, formatDiv("-h")))
            + formatDiv("-i");

    public static void view() {

        System.out.println(AnsiColors.ANSI_BLUE_BACKGROUND + "Team Stats. Light Team: " + AnsiColors.ANSI_RESET);
        Main.lightSide.forEach(n -> System.out.println(AnsiColors.ANSI_BLUE + n.getInfo() + AnsiColors.ANSI_RESET));
        System.out.println(AnsiColors.ANSI_GREEN_BACKGROUND + "Team Stats. Dark Team: " + AnsiColors.ANSI_RESET);
        Main.darkSide.forEach(n -> System.out.println(AnsiColors.ANSI_GREEN + n.getInfo() + AnsiColors.ANSI_RESET));

        if (step++ == 0) {
            System.out.println(AnsiColors.ANSI_RED + "First step!" + AnsiColors.ANSI_RESET); 
        } else {
            System.out.println(AnsiColors.ANSI_RED + "Step: " + step + AnsiColors.ANSI_RESET);
        }

        System.out.println(ConsoleView.top10);
        for (int i = 1; i <= Main.TEAM_SIZE-1; i++) {
            
            for (int j = 1; j <= Main.TEAM_SIZE; j++) {
                System.out.print(getChar(new Vector2(i, j)));
                
            }
            System.out.println("|");
            System.out.println(ConsoleView.mid10);
        }

        for (int j = 1; j <= Main.TEAM_SIZE; j++) {
                
            System.out.print(getChar(new Vector2(10, j)));
        }
        System.out.println("|");
        System.out.println(ConsoleView.bottom10);
        
        
    }

    private static String getChar(Vector2 position) {
        String str = "| ";
        for (int i = 0; i < Main.TEAM_SIZE; i++) {
            // boolean alive = false;
            if (Main.lightSide.get(i).getPosition().isEqual(position)) {
                if (Main.lightSide.get(i).getStatus()=="Dead") {
                    str = "|" + AnsiColors.ANSI_RED + Main.lightSide.get(i).getName().toUpperCase().charAt(0) + AnsiColors.ANSI_RESET;
                }
                else {
                    str = "|" + AnsiColors.ANSI_BLUE + Main.lightSide.get(i).getName().toUpperCase().charAt(0) + AnsiColors.ANSI_RESET;
                }
                // if (Main.lightSide.get(i).getStatus()!="Dead") {
                //     alive = true;
                // }
            }
            if (Main.darkSide.get(i).getPosition().isEqual(position)) {
                if (Main.darkSide.get(i).getStatus()=="Dead") {
                    str = "|" + AnsiColors.ANSI_RED + Main.darkSide.get(i).getName().toUpperCase().charAt(0) + AnsiColors.ANSI_RESET;
                }else {
                    str = "|" + AnsiColors.ANSI_GREEN + Main.darkSide.get(i).getName().toUpperCase().charAt(0) + AnsiColors.ANSI_RESET;
                }
                // if (Main.darkSide.get(i).getStatus()!="Dead") {
                //     alive = true;
                // }
            }
        }
        return str;
    }

    private static String formatDiv(String str) {
        return str.replace('a', '\u260c')
                .replace('b', '\u262c')
                .replace('c', '\u2610')
                .replace('d', '\u261c')
                .replace('e', '\u263c')
                .replace('f', '\u2624')
                .replace('g', '\u2614')
                .replace('h', '\u2634')
                .replace('i', '\u2618')
                .replace('-', '\u2600');
    }
}