package oop_class.Seminar2;
import java.util.ArrayList;

public class Marksman extends Npc {

    public Marksman(ArrayList<Npc> group) {
        super(6, 3, 16, new int[]{2,3}, 10, 4, false, false, "Marksman");
        super.group = group;
    }

    @Override
    public void Step(ArrayList<Npc> group) {
        
    }
}
