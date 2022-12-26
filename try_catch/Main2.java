import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        while(true){
            int[] arr = {1,45,34,69,0};
            Scanner sc = new Scanner(System.in);
            System.out.println("Type your index: ");
            int number = sc.nextInt();
            try {
                System.out.println("Your number" + checkArray(arr, number));
            } catch (Exception e) {
                switch(Integer.parseInt(e.getMessage())) {
                    case -1:
                        System.out.println("Array is too small!");
                        break;
                    case -2:
                        System.out.println("Number at this index doesn't exist");
                        break;
                    case -3:
                        System.out.println("Empty array!");
                        break;
                    case -69:
                        System.out.println("Array doesn't have this index");
                        break;
                }
            }
        }
    }

    public static int checkArray(int[] arr, int index) throws Exception {
        if (arr.length < 5) throw new Exception("-1");
        if (arr.length < index) throw new Exception("-2");
        if (arr.length == 0) throw new Exception("-3");
        if (arr[3] != 69) throw new Exception("-69");
        return arr[index];
    }
}
