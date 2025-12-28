/*61. Read a string and print its length
Input:
Java
Output:
4*/
import java.util.Scanner;
public class Task_61 {
    public static void main(String[] args) {
        String strings;
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the string: ");
            strings=sc.next();
            System.out.println(strings.length());
        }
    }
}
