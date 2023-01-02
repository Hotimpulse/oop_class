import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
// public class Sem2_hw {
//     public static void main(String[] args) {
//         floaty();
//     }

//     public static void floaty(){
//         while(true){
//             System.out.println("Please enter a float number: ");
//             Scanner sc = new Scanner(System.in);
//             try {
//                 float number = sc.nextFloat();
//                 System.out.println("Your number is: " + number);
//             }catch(Exception e){
//                 System.out.println("This is not a float number. Consider revising.");
//             }
//         }
//     }
// }
// ----------------------
// 2. Если необходимо, исправьте данный код 
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
// --------Solution
// public class Sem2_hw {
//     public static void main(String[] args) {
//         try {
//             int d = 0;
//             int[] array1 = {1,2,3,4,5,6,7,8,9,0};
//             double catchedRes1 = array1[8] / d;
//             System.out.println("catchedRes1 = " + catchedRes1);
//          } catch (ArithmeticException e) {
//             System.out.println("Catching exception: " + e);
//          }
         
//     }
// }
// ----------------------
// Дан следующий код, исправьте его там, где требуется 
// (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
// --------Solution
// public class Sem2_hw {
//     public static void main(String[] args) throws Exception {
//         try {
//             int a = 90;
//             int b = 3;
//             System.out.println(a / b);
//             printSum(23, 234);
//             int[] abc = { 1, 2 };
//             try {
//                 abc[3] = 9;
//             } catch (IndexOutOfBoundsException ex) {
//                 System.out.println("Массив выходит за пределы своего размера!");
//             }
//         } catch (Throwable ex) {
//             System.out.println("Что-то пошло не так...");
//         } 
//      }
//      public static void printSum(Integer a, Integer b) {
//         try {
//             System.out.println(a + b);
//         } catch (NullPointerException npe) {
//             System.out.println("Указатель не может указывать на null!");
//         } 
//     }
// }
// ----------------------
// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
// --------Solution
// public class Sem2_hw {
//     public static void main(String[] args) throws Exception {
//         checkStr();
//     }
//     public static void checkStr() throws Exception {
//         Scanner sc = new Scanner(System.in);
//         String smth = sc.nextLine();
//         if (smth.length() == 0) throw new Exception("String can't be empty. Please, write something.");
//     }
// }
// ----------------------