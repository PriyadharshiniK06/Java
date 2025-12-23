/*32.Read a number and check whether it is divisible by 2 or 3.
Input: 9
Output: Divisible by 3*/
import java.util.Scanner;
public class Task_32 {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            if(number%2==0 && number%3!=0){
                System.out.println("Divisible by 2");
            }
            else if(number%2!=0 && number%3==0){
                System.out.println("Divisible by 3");
            }
            else{
                System.out.println("Not Divisible by 2 and 3");
            }
        }
    }
}
