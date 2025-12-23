/*23.Check whether a number is divisible by both 5 and 11.
Input: 55
Output: Divisible */
import java.util.Scanner;
public class Task_23 {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            if(number%5==0 && number %11==0){
                System.out.println("Number is divisible by 5 and 11");
            }
            else{
                System.out.println("Number is not divisible by 5 and 11");
            }
        }
    }
}
