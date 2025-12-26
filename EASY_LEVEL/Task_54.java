/*54.Find product of digits of a number.
Input: 123
Output: 6 */
import java.util.Scanner;
public class Task_54 {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            int multi=1;
            for(;number>0;number/=10){
                multi*=number%10;
            }
            System.out.println(multi);
        }
    }
}
