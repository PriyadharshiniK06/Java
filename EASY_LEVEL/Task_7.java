/*7.Read a number and print its square.
Input: 6
Output: 36 */
import java.util.Scanner;
public class Task_7 {
    public static void main(String[]args){
        int a;
        System.out.print("Enter the number: ");
        try(Scanner sc = new Scanner(System.in)){
            a=sc.nextInt();
            System.out.println(a*a);
        }
    }
}
