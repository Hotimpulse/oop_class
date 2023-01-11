import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.HashMap;

public class test7 {
    static String surname = null;
    static String name = null;
    static String middleName = null;
    static String dobString = null;
    static String phoneNumber = null;
    static String gender = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        // String input = getUserInput(scanner);

        String[] keys = {"surname", "name", "middleName", "dob", "gender", "phoneNumber"};
        HashMap<String, String> dataPoints = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // if (dataPoints.length != 6) {
        //     throw new IllegalArgumentException(
        //                 "Incorrect number of data points entered. Please enter 6 data points separated by spaces.");
        // }
        
        for(String key: keys) {
            System.out.print("Enter " + key + ": ");
            try {
                dataPoints.put(key, br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {

            String surname = dataPoints.get("surname");
            if (surname == null)
                throw new IllegalArgumentException(
                        "Surname not found in the input, please enter again with proper format");
            String name = dataPoints.get("name");
            if (name == null)
                throw new IllegalArgumentException(
                        "Name not found in the input, please enter again with proper format");
            String middleName = dataPoints.get("middleName");
            if (middleName == null)
                throw new IllegalArgumentException(
                        "Middle Name not found in the input, please enter again with proper format");
            String dobString = dataPoints.get("dob");
            if (dobString == null)
                throw new IllegalArgumentException(
                        "Date of birth not found in the input, please enter again with proper format");
            while (dobString == null) {
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                    dateFormat.setLenient(false);
                dateFormat.parse(dobString);
                } catch (Exception e) {
                    System.out.println("Invalid date! Please enter your birthday in the format dd.mm.yyyy");
                    dobString = null;
                }
            }            
            String gender = dataPoints.get("gender");
            if (gender == null)
                throw new IllegalArgumentException(
                        "Gender not found in the input, please enter again with proper format");

            if (!gender.equals("f") && !gender.equals("m")) {
                throw new IllegalArgumentException("Invalid gender format. Gender should be 'f' or 'm'.");
            }

            String phoneNumber = dataPoints.get("phoneNumber");
            if (phoneNumber == null)
                throw new IllegalArgumentException(
                        "Phone number not found in the input, please enter again with proper format");

            if (phoneNumber.length() != 10) {
                throw new IllegalArgumentException(
                        "Invalid phone number format. Phone number should be 10 digits long.");
            }
            if (!phoneNumber.matches("[0-9]+")) {
                throw new IllegalArgumentException(
                        "Invalid phone number format. Phone number should contain only digits.");
            }
            System.out.println("Surname: " + surname);
            System.out.println("Name: " + name);
            System.out.println("Middle name: " + middleName);
            System.out.println("Date of birth: " + dobString);
            System.out.println("Gender: " + gender);
            System.out.println("Phone number: " + phoneNumber);
            writeFile();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            main(args);
        }
    }

    // private static String getUserInput(Scanner scanner) {
    //     System.out.print("Enter data, separated by spaces - surname/name/middle name/Date of Birth (dd.mm.yyyy)/phone number(10 digits) and gender(f/m): ");
    //     return scanner.nextLine();
    // }

    public static void writeFile() {
        try {
            String data = "<" + surname + ">" + "<" + name + ">" + "<" + middleName + ">" + "<" + dobString + ">"
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

            System.out.println("Data successfully written to the file named " + surname + ".");

        } catch (IOException e) {
            System.out.println("Error writing to file. Stack trace: ");
            e.printStackTrace();
        }
    }
}