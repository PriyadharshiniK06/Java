/*2.A shop records one integer number. Print the same number.
Input: 25
Output: 25 */
import java.util.Scanner;
public class Task_2 {
    public static void main (String[]args){
        int n;
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number : ");
            n=sc.nextInt();
            System.out.println(n);
        }
    }
}
