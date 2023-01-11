import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class test4 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String[] data = new String[6];
        String[] keys = { "surname", "name", "middle name", "date of birth", "phone number", "gender" };
        Pattern phoneNumberPattern = Pattern.compile("\\d{10}");
        String input;

        while (true) {
            try {
                // Prompt the user to enter their personal information in random order
                for (int i = 0; i < 6; i++) {
                    System.out.print("Enter your " + keys[i] + ": ");
                    input = scanner.nextLine();

                    // Parse the input data
                    if (keys[i].equals("surname")) {
                        if (input.length() == 0 && !(input instanceof String)) {
                            throw new IOException("Error: Surname is required.");
                        }
                        data[0] = input;
                    } else if (keys[i].equals("name")) {
                        if (input.length() == 0 && !(input instanceof String)) {
                            throw new IOException("Error: Name is required.");
                        }
                        data[1] = input;
                    } else if (keys[i].equals("middle name")) {
                        if (input.length() == 0 && !(input instanceof String)) {
                            throw new IOException("Error: Middle name is required.");
                        }
                        data[2] = input;
                    } else if (keys[i].equals("date of birth")) {
                        validateBirthday(keys[i].equals("date of birth"));
                        if (input.length() == 0) {
                            throw new IOException("Error: Date of birth is required.");
                        }
                        data[3] = input;
                    } else if (keys[i].equals("phone number")) {
                        if (input.length() == 0) {
                            throw new IOException("Error: Phone number is required.");
                        }
                        data[4] = input;
                    } else if (keys[i].equals("gender")) {
                        if (input.length() == 0) {
                            throw new IOException("Error: Gender is required.");
                        }
                        data[5] = input;
                    }
                    // Validate the input data
                    else if (!dateFormat.parse(data[3]).before(new java.util.Date())) {
                        throw new IOException("Error: Invalid date of birth.");
                    } else if (!phoneNumberPattern.matcher(data[4]).matches()) {
                        throw new IOException("Error: Invalid phone number.");
                    } else if (!data[5].equals("m") && !data[5].equals("f")) {
                        throw new IOException("Error: Invalid gender.");
                    }
                }

                // Write the personal information to a file
                BufferedWriter writer = new BufferedWriter(new FileWriter(data[0] + ".txt", true));
                writer.write(data[0] + " " + data[1] + " " + data[2] + " " + data[3] + " " + data[4] + " " + data[5]);
                writer.newLine();
                writer.close();

                break;
            } catch (IOException | ParseException e) {
                // If there was an error, show an exception prompt and ask the user to re-enter
                // their data
                System.out.println("Error: Please enter all required fields in the correct format.");
            }
        }
        scanner.close();
    }

    private static void validateBirthday(boolean equals) throws ParseException {
        final String DATE_FORMAT = "dd.MM.yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        Calendar calendar = Calendar.getInstance();
        
        try (Scanner sc = new Scanner(System.in)) {
            String dateOfBirth = sc.nextLine();
            // Set the time to be the entered birthday
            calendar.setTime(dateFormat.parse(dateOfBirth));

            // Check if the entered month is valid (1-12)
            int month = calendar.get(Calendar.MONTH) + 1;
            if (month < 1 || month > 12) {
                dateOfBirth = null;
                throw new ParseException("Invalid month", 0);
            }

            // Check if the entered day is valid for the given month
            int day = calendar.get(Calendar.DATE);
            int numDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            if (day < 1 || day > numDaysInMonth) {
                dateOfBirth = null;
                throw new ParseException("Invalid day", 0);
            }
        }
    }
}
