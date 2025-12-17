/*3.Read two integers and print their sum.
Input: 10 20
Output: 30 */
import java.util.Scanner;
public class Task_3 {
    public static void main(String[]args){
        int a,b;
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the two numbers: ");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a+b);

        }
    }
}
