/*10.Read radius and print area of a circle.
Input: 7
Output: 153.94 */
import java.util.Scanner;
public class Task_10 {
    public static void main(String[] args) {
        int radius;
        System.out.print("Enter the radius of the circle : ");
        try(Scanner sc=new Scanner(System.in)){
            radius=sc.nextInt();
            System.out.println("Area : "+(3.1416*radius*radius));
        }
    }
}
