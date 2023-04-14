import java.util.ArrayList;

public class Animal {


    protected int id;
    protected String name;
    protected String dateOfBirth;
    protected String commands;
    public ArrayList<String> commandList = new ArrayList<>();


    protected String subtype;

    public Animal(int id, String name, String dateOfBirth, String subtype) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.subtype = subtype;
    }

    public void addCommand(String command) {
        this.commandList.add(command);
    }

    public void listCommands(){
        for (String command : this.commandList) {
            System.out.println(command);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }
    public String getSubType() {
        return this.subtype;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id = " + id +
                ", name = " + name +
                ", date of birth = " + dateOfBirth +
                ", type = " + subtype +
                ", commands = " + commands + "}";
    }


}