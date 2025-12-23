/*17.Check whether a number is positive, negative, or zero.
Input: -5
Output: Negative */
import java.util.Scanner;
public class Task_17 {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            a=sc.nextInt();
            if(a>0){
                System.out.println("Positive");
            }
            else if(a==0){
                System.out.println("Zero");
            }
            else{
                System.out.println("Negative");
            }
        }
    }
}

