/*21.Check whether a character is a vowel or consonant.
Input: e
Output: Vowel */
import java.util.Scanner;
public class Task_21 {
    public static void main(String[] args) {
        char alp;
        System.out.print("Enter the character: ");
        try(Scanner sc=new Scanner(System.in)){
             alp=sc.next().charAt(0);
             if(alp=='a' || alp=='e'|| alp=='i' || alp=='o' || alp=='u'|| alp=='A' || alp=='E'|| alp=='I' || alp=='O' || alp=='U'){
                System.out.println("Vowel");
             }
             else{
                System.out.println("Consonant");
             }
        }
    }
}
