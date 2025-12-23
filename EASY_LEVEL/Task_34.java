/*34.Read three sides and check if triangle is equilateral.
Input: 5 5 5
Output: Equilateral Triangle*/
import java.util.Scanner;
public class Task_34 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("Enter the three sides of the triangle: ");
        try(Scanner sc=new Scanner(System.in)){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(a==b &&b==c){
                System.out.println("Equilateral Triangle ");
            }
            else{
                System.out.println("Not a Equilateral Triangle");
            }
        }
    }
}
