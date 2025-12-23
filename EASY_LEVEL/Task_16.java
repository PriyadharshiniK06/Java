/*16.Check whether a number is even or odd.
Input: 7
Output: Odd */ 
import java.util.Scanner;
public class Task_16 {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            if(number%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
}

