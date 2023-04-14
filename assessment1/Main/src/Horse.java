import java.util.ArrayList;

public class Horse extends PackAnimal {
    public Horse(int id, String name, String dateOfBirth, String subtype, String commands, String species) {
        super(id, name, dateOfBirth, subtype);
        this.commands = commands;
        this.species = species;
    }
}