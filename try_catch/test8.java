import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.InputMismatchException;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test8 {
    static String surname = null;
    static String name = null;
    static String middleName = null;
    static String dateOfBirth = null;
    static String phoneNumber = null;
    static String gender = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            
            Runnable[] methods = {test8::getName, test8::getBirthday, test8::getPhoneNumber, test8::getGender};
            
            shuffleArray(methods);
            for (Runnable method : methods) {
                method.run();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            writeFile();
        }
    }

    private static void shuffleArray(Runnable[] array){
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            Runnable a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    public static void getName() {
        while (surname == null) {
            try {
                System.out.println("Enter your surname: ");
                surname = scanner.nextLine();
            } catch (Exception e) {
                for (int i = 0; i < surname.length(); i++) {
                    char c = surname.charAt(i);
                    if (!Character.isLetter(c))
                        System.out.println("This field can only contain letters.");
                }
                System.out.println("This field can only contain letters. Check your input!");
                surname = null;
            }
        }
        while (name == null) {
            try {
                System.out.println("Enter your name: ");
                name = scanner.nextLine();
                for (int i = 0; i < name.length(); i++) {
                    char d = name.charAt(i);
                    if (!Character.isLetter(d))
                        throw new Exception("This field can only contain letters.");
                }
            } catch (Exception e) {
                System.out.println("This field can only contain letters. Check your input!");
                name = null;
            }
        }
        while (middleName == null) {
            try {
                System.out.println("Enter your middle name: ");
                middleName = scanner.nextLine();
                for (int i = 0; i < middleName.length(); i++) {
                    char e = middleName.charAt(i);
                    if (!Character.isLetter(e))
                        throw new Exception("This field can only contain letters.");
                }
            } catch (Exception e) {
                System.out.println("This field can only contain letters. Check your input!");
                middleName = null;
            }
        }
    }

    public static void getBirthday() {
        while (dateOfBirth == null) {
            try {
                System.out.print("Enter your birthday in the format dd.mm.yyyy: ");
                dateOfBirth = scanner.nextLine();

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                dateFormat.setLenient(false);
                dateFormat.parse(dateOfBirth);
            } catch (Exception e) {
                System.out.println("Invalid date! Please enter your birthday in the format dd.mm.yyyy");
                dateOfBirth = null;
            }
        }
    }

    public static void getPhoneNumber() {
        Pattern phoneNumberPattern = Pattern.compile("\\d{10}");
        while (phoneNumber == null) {
            try {
                System.out.println("Enter your phone number: ");
                phoneNumber = scanner.nextLine();
                if (!phoneNumberPattern.matcher(phoneNumber).matches()){
                    System.out.println("Invalid phone number!");
                    phoneNumber = null;
                }
                Long.parseLong(phoneNumber);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a 10-digit phone number with no symbols.");
                phoneNumber = null;
            }
        }
    }

    public static void getGender() {
        while (gender == null) {
            try {
                System.out.println("Enter your gender (f or m): ");
                gender = scanner.nextLine();

                if (!gender.equalsIgnoreCase("f") && !gender.equalsIgnoreCase("m")) {
                    System.out.println("Your gender input is incorrect.");
                    gender = null;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid gender. Please enter f or m.");
                gender = null;
            }
        }
    }

    public static void writeFile() {
        try {
            String data = "<" + surname + ">" + "<" + name + ">" + "<" + middleName + ">" + "<" + dateOfBirth + ">"
                    + "<" + phoneNumber + ">" + "<" + gender + ">";
            File file = new File(surname + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.newLine();
            bw.close();

            System.out.println("Data successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error writing to file. Stack trace: ");
            e.printStackTrace();
        }
    }

}