
import java.util.ArrayList;
import java.util.Scanner;

public class PetRegistry {
    private static final ArrayList<Animal> animalList = new ArrayList<>();
    private static final Counter counter = new Counter();

    public static void main(String[] args) {
        PetRegistry registry = new PetRegistry();
        registry.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Add a new animal");
            System.out.println("2. Place the animal in the correct class");
            System.out.println("3. See the list of commands that the animal executes");
            System.out.println("4. Teach the animal new commands");
            System.out.println("5. Exit");

            System.out.print("Enter your number here: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> addAnimal();
                case 2 -> placeAnimalInClass();
                case 3 -> seeAnimalCommands();
                case 4 -> teachAnimalNewCommands();
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option");
            }

            System.out.println("Total number of animals: " + counter.getCount());
            System.out.println("List of all animals:");
            for (Animal animal : animalList) {
                System.out.println(animal);
            }
        }
    }

    private static void addAnimal() {
        ArrayList<String> cats = new ArrayList<>();
        ArrayList<String> dogs = new ArrayList<>();
        ArrayList<String> hamsters = new ArrayList<>();
        ArrayList<String> donkeys = new ArrayList<>();
        ArrayList<String> horses = new ArrayList<>();
        ArrayList<String> allAnimals = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select animal's species:");
        System.out.println("1 - Dog");
        System.out.println("2 - Cat");
        System.out.println("3 - Hamster");
        System.out.println("4 - Horse");
        System.out.println("5 - Donkey");

        int animalSpecies = scanner.nextInt();

        System.out.println("Please enter the animal's name:");
        String name = scanner.next();

        System.out.println("Please enter the animal's date of birth (YYYY-MM-DD):");
        String dateOfBirth = scanner.next();


        Scanner input = new Scanner(System.in);
        String subtype = "";
        boolean validSubtype = false;

        while(!validSubtype) {
            System.out.println("Please enter the animal's class (Pack/Domestic):");
            subtype = input.nextLine();
            try {
              if(!subtype.equalsIgnoreCase("Domestic") && (!subtype.equalsIgnoreCase("Pack"))){
                  throw new IllegalArgumentException("Invalid subtype entered. Please enter either 'Domestic' or 'Pack'");
              }
              validSubtype = true;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Please enter the animal's primary command:");
        String primaryCommand = scanner.next();


        System.out.println("Animal added successfully!");

        Animal animal = null;
//        int id = counter.add();

        switch (animalSpecies) {
            case 1:
                animal = new Dog(counter.getCount(), name, dateOfBirth, subtype, primaryCommand);
                animal.addCommand(primaryCommand);
                dogs.add(animal.toString());
                animalList.add(animal);
                break;
            case 2:
                animal = new Cat(counter.getCount(), name, dateOfBirth, subtype, primaryCommand);
                animal.addCommand(primaryCommand);
                cats.add(animal.toString());
                animalList.add(animal);
                break;
            case 3:
                animal = new Hamster(counter.getCount(), name, dateOfBirth, subtype, primaryCommand);
                animal.addCommand(primaryCommand);
                hamsters.add(animal.toString());
                animalList.add(animal);
                break;
            case 4:
                animal = new Horse(counter.getCount(), name, dateOfBirth, subtype, primaryCommand);
                animal.addCommand(primaryCommand);
                horses.add(animal.toString());
                animalList.add(animal);
                break;
            case 5:
                animal = new Donkey(counter.getCount(), name, dateOfBirth, subtype, primaryCommand);
                animal.addCommand(primaryCommand);
                donkeys.add(animal.toString());
                animalList.add(animal);
                break;
            default:
                System.out.println("Invalid animal type");
                return;
        }

        System.out.println("Total animals in the registry: " + allAnimals.size());


    }

    private void seeAnimalCommands() {
        System.out.println("Please enter the animal's ID: ");
        Scanner scanner = new Scanner(System.in);
        int animalID = scanner.nextInt();

        Animal animal = animalList.get(animalID);
        if (animal == null) {
            System.out.println("Animal not found.");
            return;
        }
        System.out.println(animal.getName() + " knows the following commands:");
        animal.listCommands();

    }

    private void teachAnimalNewCommands() {
    }

    private void placeAnimalInClass() {

    }

//    private void seeAllAnimals() {
//        System.out.println("All animals:");
//        for (String d : dogs) {
//            System.out.println(d.toString());
//        }
//        for (String c : cats) {
//            System.out.println(c.toString());
//        }
//        for (String h : hamsters) {
//            System.out.println(h.toString());
//        }
//        for (String h : horses) {
//            System.out.println(h.toString());
//        }
//        for (String d : donkeys) {
//            System.out.println(d.toString());
//        }
//    }
}











