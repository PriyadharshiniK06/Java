/*29.Check whether a triangle is valid using angles.
Input: 60 60 60
Output: Valid Triangle*/
import java.util.Scanner;
public class Task_29 {
    public static void main(String[]args){
        int a,b,c;
        System.out.print("Enter the three sides of a triangle: ");
        try(Scanner sc=new Scanner(System.in)){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(a>0 && b>0 && c>0 && (a+b+c)==180){
                System.out.println("Valid Triangle");
            }
            else{
                System.out.println("Invalid Triangle");
            }
        }
    }
}
