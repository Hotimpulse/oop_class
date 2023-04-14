
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
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
            System.out.println("5. See all animals");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Enter your number here: ");
            System.out.println();
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> addAnimal();
                case 2 -> placeAnimalInClass();
                case 3 -> seeAnimalCommands();
                case 4 -> teachAnimalNewCommands();
                case 5 -> seeAllAnimals();
                case 6 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option");
            }

//            System.out.println("Total number of animals: " + animalList.size());
//            System.out.println("List of all animals:");
//            for (Animal animal : animalList) {
//                System.out.println(animal);
//            }
        }
    }

    private static void addAnimal() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select animal's species by typing a number:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Hamster");
        System.out.println("4. Horse");
        System.out.println("5. Donkey");

        int choice = scanner.nextInt();

        System.out.println("Please enter the animal's name:");
        String name = scanner.next();

        System.out.println("Please enter the animal's date of birth (YYYY-MM-DD):");
        String dateOfBirth = scanner.next();
        while(true){
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                dateFormat.setLenient(false);
                dateFormat.parse(dateOfBirth);
                break;
            } catch (Exception e) {
                System.out.println("This date format is incorrect, make sure to use YYYY-MM-DD");
                return;
            }
        }

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

        switch (choice) {
            case 1 -> {
                animal = new Dog(counter.getCount(), name, dateOfBirth, subtype, primaryCommand, "Dog");
                animal.addCommand(primaryCommand);
                animalList.add(animal);
            }
            case 2 -> {
                animal = new Cat(counter.getCount(), name, dateOfBirth, subtype, primaryCommand, "Cat");
                animal.addCommand(primaryCommand);
                animalList.add(animal);
            }
            case 3 -> {
                animal = new Hamster(counter.getCount(), name, dateOfBirth, subtype, primaryCommand, "Hamster");
                animal.addCommand(primaryCommand);
                animalList.add(animal);
            }
            case 4 -> {
                animal = new Horse(counter.getCount(), name, dateOfBirth, subtype, primaryCommand, "Horse");
                animal.addCommand(primaryCommand);
                animalList.add(animal);
            }
            case 5 -> {
                animal = new Donkey(counter.getCount(), name, dateOfBirth, subtype, primaryCommand, "Donkey");
                animal.addCommand(primaryCommand);
                animalList.add(animal);
            }
            default -> {
                System.out.println("Invalid animal type");
                return;
            }
        }

        System.out.println("Total animals in the registry: " + animalList.size());
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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the animal's ID: ");
        int animalID = Integer.parseInt(scanner.nextLine());

        Animal animal = null;
        System.out.println("Enter the new commands for the animal (separated by commas): ");
        String newCommands = scanner.nextLine();

        try {
            animal = animalList.get(animalID);
            animal.addCommand(Arrays.toString(newCommands.split(",")));
            System.out.println("New commands added to " + animal.getName() + ".");
            System.out.println();
        } catch (Exception e) {
            System.out.println("Animal not found!");
            System.out.println(e.getMessage());
        }
}

    private void placeAnimalInClass() {

        while(true){
            System.out.println("Enter id of the animal to change its class: ");
            Scanner scanner = new Scanner(System.in);
            int scanID = scanner.nextInt();
            Animal animal2 = animalList.get(scanID);
            if (animal2 == null) {
                System.out.println("This animal doesn't exist in the registry.");
                return;
            }else{
                System.out.println("Your animal's class is: " + animalList.get(scanID).getSubType());
                System.out.println("Change class:");
                System.out.println("1 - yes");
                System.out.println("2 - no");
                scanner.nextInt();

                if (animal2.subtype.equalsIgnoreCase("Domestic")) {
                    animal2.subtype = "Pack";
                    System.out.println("Your animal's class has been changed to: " + animalList.get(scanID).getSubType());
                    return;
                }else if(animal2.subtype.equalsIgnoreCase("Pack")) {
                    animal2.subtype = "Domestic";
                    System.out.println("Your animal's class has been changed to: " + animalList.get(scanID).getSubType());
                    return;
                }else{
                    return;
                }
            }
        }

    }

    private void seeAllAnimals() {
        System.out.println("List of all animals:");
        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }
}