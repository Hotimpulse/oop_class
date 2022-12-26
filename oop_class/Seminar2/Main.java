package oop_class.Seminar2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {

    public static final int TEAM_SIZE = 10;

    private static List<Base> lightSide;

    private static List<Base> darkSide;
    
    public static void main(String[] args) {
        init();

        // System.out.println("Light team: ");
        // lightSide.forEach(n -> System.out.println(n.getInfo()));
        // System.out.println("Dark team: ");
        // darkSide.forEach(n -> System.out.println(n.getInfo()));

        Wizard p1 = new Wizard(darkSide);
        System.out.println("Before healing: " + p1.getHealth()); //full hp
        p1.getAttacked(1); // attacked -1 HP
        System.out.println("After attack: " + p1.getHealth());
        p1.Step(darkSide); // healing method called
        
        System.out.println("After healing: " + p1.getHealth()); //after healing
        System.out.println("---+++---");

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println("iter.next()");
        }

        for (int i = 0; i <= darkSide.size(); i++) {
            // System.out.println();
            darkSide.(n -> System.out.println(n.getHealth()));
        }
    }

    

    private static void init() {
        lightSide = new ArrayList<>();
        darkSide = new ArrayList<>();

        for (int i = 0; i < TEAM_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    lightSide.add(new Peasant(lightSide));
                    break; 
                case 1:
                    lightSide.add(new Monk(lightSide));
                    break;
                case 2:
                    lightSide.add(new Pikeman(lightSide));
                    break;
                default:
                    lightSide.add(new Marksman(lightSide));
            }
        }
       
        for (int i = 0; i < TEAM_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0: 
                    darkSide.add(new Peasant(darkSide));
                    break;
                case 1: 
                    darkSide.add(new Wizard(darkSide));
                    break;
                case 2: 
                    darkSide.add(new Thief(darkSide));
                    break;
                default: 
                    darkSide.add(new Sniper(darkSide));
            }
        }
    }
}
