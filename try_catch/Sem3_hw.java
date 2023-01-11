import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Sem3_hw {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("***\n" + "Enter data, separated by spaces. Get a text file back!***\n" +
                        "In no specific order, type in a surname/name/middle name/\n" + 
                        "date of birth (dd.mm.yyyy)/phone number(10 digits) and gender(f/m):\n");
            String input = br.readLine();

            String[] data = input.split(" ");
            if (data.length != 6) {
                throw new IllegalArgumentException("Incorrect number of data points entered. Please enter 6 data points separated by spaces.");
            }

            String surname = null;
            String name = null;
            String middleName = null;
            String dobString = null;
            String gender = "f";
            String phoneNumber = null;

            for (String s : data) {
                if (s.matches("[a-zA-Z]\\w{2,29}")) {
                    if (surname == null) surname = s;
                    else if (name == null) name = s;
                    else if (middleName == null) middleName = s;
                } else if (s.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                    dobString = s;
                } else if (s.matches("[fF]") || s.matches("[mM]")) {
                    gender = s;
                } else if (s.matches("\\d{10}")) {
                    phoneNumber = s;
                }
            }

            if (surname == null)
                throw new IllegalArgumentException("Surname not found in the input, please enter again with proper format");
            if (name == null)
                throw new IllegalArgumentException("Name not found in the input, please enter again with proper format");
            if (middleName == null)
                throw new IllegalArgumentException("Middle name not found in the input, please enter again with proper format");
            if (dobString == null)
                throw new IllegalArgumentException("Date of birth not found in the input, please enter again with proper format");
            if (phoneNumber == null)
                throw new IllegalArgumentException("Phone number not found in the input, please enter again with proper format");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            dateFormat.setLenient(false);
            dateFormat.parse(dobString);

            System.out.println("Surname: " + surname);
            System.out.println("Name: " + name);
            System.out.println("Middle name: " + middleName);
            System.out.println("Date of birth: " + dobString);
            System.out.println("Gender: " + gender);
            System.out.println("Phone number: " + phoneNumber);
            writeDataToFile(surname, name, middleName, dobString, gender, phoneNumber);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            main(args);
        } catch (ParseException e) {
            System.out.println("Invalid date of birth format. Date of birth should be in the format dd.MM.yyyy.");
            main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeDataToFile(String surname, String name, String middleName, String dobString, String gender, String phoneNumber) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            String dob = dateFormat.format(dateFormat.parse(dobString));
            String fileName = surname + ".txt";
            File file = new File(fileName);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("<" + surname + ">" + "<" + name + ">" + "<" + middleName + ">" + "<" + dob + ">"
            + "<" + phoneNumber + ">" + "<" + gender + ">");
            bw.newLine();
            bw.close();

            System.out.println("Data written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}