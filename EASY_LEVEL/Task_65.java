/*Convert lowercase string to uppercase
Input: java
Output: JAVA*/
import java.util.Scanner;
public class Task_65 {
    public static void main(String[] args) {
        String strings;
        try(Scanner sc=new Scanner(System.in)){
             System.out.print("Enter the string: ");
             strings=sc.next();
             System.out.println(strings.toUpperCase());
        }
    }
}
