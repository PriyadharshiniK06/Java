/*13.Read two floating-point numbers and print their average.
Input: 2.5 3.5
Output: 3.0 */
import java.util.Scanner;
public class Task_13 {
    public static void main(String[]args) {
        float a,b,avg;
        System.out.print("Enter the two float numbers: ");
        try(Scanner sc=new Scanner(System.in)){
            a=sc.nextFloat();
            b=sc.nextFloat();
            avg=(a+b)/2;
            System.out.println(avg);
        }
    }
}

