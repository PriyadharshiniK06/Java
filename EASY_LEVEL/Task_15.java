/*15.Read an integer and print whether it is positive.
Input: 10
Output: Positive number */
import java.util.Scanner;
public class Task_15 {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            a=sc.nextInt();
            if(a>=0){
                System.out.println("Positive");
            }
            else{
                System.out.println("Negative");
            }
        }
    }
}

