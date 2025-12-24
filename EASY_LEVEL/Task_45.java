/*45.Check whether a number is a palindrome.
Input: 121
Output: Palindrome*/
import java.util.Scanner;
public class Task_45 {
    public static void main(String[] args) {
        int number,reverse=0;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            int orginal=number;
            for(;number>0;number/=10){
                reverse=(reverse*10)+(number%10);
            }
            if(reverse==orginal){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not Palindrome");
            }
        }
    }
}
