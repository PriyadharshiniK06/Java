/*5.Read two numbers and print their product.
Input: 4 5
Output: 20 */
import java.util.Scanner;
public class Task_5 {
    public static void main(String[]args){
        int a,b;
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the two numbers : ");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a*b);
        }
    }
}
