import java.util.ArrayList;

public class Cat extends DomesticAnimal {
    public Cat(int id, String name, String dateOfBirth, String subtype, String commands, String species) {
        super(id, name, dateOfBirth, subtype);
        this.commands = commands;
        this.species = species;
    }
}