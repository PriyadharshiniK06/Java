/*56.
Print numbers in reverse order from N to 1.
Input: 5
Output: 5 4 3 2 1 */
import java.util.Scanner;
public class Task_56{
    public static void main(String[]args){
        int number;
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number: ");
            number=sc.nextInt();
            for(int i=number;i>=1;i--){
                System.out.print(i+" ");
            }
        }
    }
}