/*26.Check whether a character is uppercase or lowercase.
Input: a
Output: Lowercase*/
import java.util.Scanner;
public class Task_26 {
    public static void main(String[] args) {
        char alp;
        System.out.print("Enter the character: ");
        try(Scanner sc=new Scanner(System.in)){
            alp=sc.next().charAt(0);
            if(alp>='a' && alp<='z'){
                System.out.println("Lowercase");
            }
            else{
                System.out.println("Uppercase");
            }
        }
    }
}
