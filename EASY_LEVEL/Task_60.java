/*60.Find smallest digit in a number.
Input: 9832
Output: 2*/
import java.util.Scanner;
public class Task_60 {
    public static void main(String[] args) {
        int number;
        int digit,digit_prev;
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number: ");
            number=sc.nextInt();
            digit_prev=number%10;
            for(;number>0;number/=10){
                digit = number%10;
                if(digit_prev>digit){
                    digit_prev=digit;
                }
            }
            System.out.print(digit_prev);
        }
    }
}
