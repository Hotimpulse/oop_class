import java.util.ArrayList;

public class Hamster extends DomesticAnimal {
    public Hamster(int id, String name, String dateOfBirth, String subtype, String commands, String species) {
        super(id, name, dateOfBirth, subtype);
        this.commands = commands;
        this.species = species;
    }
}