import java.util.ArrayList;

public class Donkey extends PackAnimal {
    public Donkey(int id, String name, String dateOfBirth, String subtype, String commands) {
        super(id, name, dateOfBirth, subtype);
        this.commands = commands;
    }
}