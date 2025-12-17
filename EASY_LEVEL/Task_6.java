/*6.Read two numbers and print quotient and remainder.
Input: 17 5
Output:
Quotient: 3  
Remainder: 2 */
import java.util.Scanner;
public class Task_6 {
    public static void main(String[]args){
        int a,b;
        System.out.print("Enter the two numbers : ");
        try(Scanner sc=new Scanner(System.in)){
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Quotient: "+a/b);
            System.out.println("Remainder: "+a%b);
        }
    }
}
