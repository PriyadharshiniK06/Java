/*31.Check whether two numbers are equal.
Input: 10 10
Output: Equal*/
import java.util.Scanner;
public class Task_31 {
    public static void main(String[]args){
        int a,b;
        System.out.print("Enter the two numbers: ");
        try(Scanner sc=new Scanner(System.in)){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==b){
                System.out.println("Equal");
            }
            else{
                System.out.println("Not Equal");
            }
        }
    }
}
