/*40.Find factorial of a number.
Input: 5
Output: 120 */
import java.util.Scanner;
public class Task_40 {
    public static void main(String[] args) {
        int number,fact=1;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            for(int i=1;i<=number;i++){
                fact*=i;
            }
            System.out.println(fact);
        }
    }
}
