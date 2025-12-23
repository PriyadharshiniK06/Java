/*14.Read a character and print its ASCII value.
Input: A
Output: 65*/
import java.util.Scanner;
public class Task_14 {
    public static void main(String[] args) {
        char alp;
        int character;
        System.out.print("Enter the alphabet: ");
        try(Scanner sc=new Scanner(System.in)){
            alp=sc.next().charAt(0);
            character=alp;
            System.out.println(character);

        }
    }
}

