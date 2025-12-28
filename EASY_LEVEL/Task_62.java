/*Reverse a string
Input: hello
Output: olleh*/
import java.util.Scanner;
public class Task_62 {
    public static void main(String[] args) {
        String strings;
        String reverses;
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the string: ");
            strings=sc.next();
            StringBuilder stringsb = new StringBuilder(strings);
            stringsb.reverse();
            reverses= stringsb.toString();
            System.out.println(reverses);
        }
    }
}
