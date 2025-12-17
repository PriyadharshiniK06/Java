/*8.Read a number and print its cube.
Input: 3
Output: 27 */
import java.util.Scanner;
public class Task_8 {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            a=sc.nextInt();
            System.out.println(a*a*a);
        }
    }
}
