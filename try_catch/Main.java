import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // try {
        //     int[] a = {1,6,3,4,5};
        //     a[3] = 12;
        //     if (a[1] > 4) throw new Exception("Wrong number. Needs to be less than 4!");
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                int result = Integer.parseInt(sc.nextLine());
                System.out.println(result + " is a number!");
                // if (sc != sc.parseInt()) throw new Exception("This is not a number!");
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                sc.close();
            }
        }
    }
}
