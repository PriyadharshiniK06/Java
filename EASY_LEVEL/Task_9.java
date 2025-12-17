/*9.Read length and breadth of a rectangle and print area.
Input: 5 4
Output: 20 */
import java.util.Scanner;
public class Task_9 {
    public static void main(String[] args) {
        int length,breadth;
        System.out.print("Enter the length and breadth of the rectangle: ");
        try(Scanner sc=new Scanner(System.in)){
            length=sc.nextInt();
            breadth=sc.nextInt();
            System.out.println("Area : "+length*breadth);
        }
    }
}
