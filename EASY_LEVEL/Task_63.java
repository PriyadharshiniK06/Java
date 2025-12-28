/*Check whether a string is a palindrome
Input: madam
Output:Palindrome*/
import java.util.Scanner;
public class Task_63 {
    public static void main(String[] args) {
        String strings;
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the string: ");
            strings=sc.next();
            String original=strings;
            StringBuilder stringB=new StringBuilder(strings);
            stringB.reverse();
            String reverses=stringB.toString();
            if(reverses.equals(original)){
                System.out.print("Palindrome");
            }
            else{
                System.out.print("Not Palindrome");
            }
        }
    }
}
