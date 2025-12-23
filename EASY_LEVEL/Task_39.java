/*39.Find sum of first N natural numbers.
Input: 5
Output: 15*/
import java.util.Scanner;
public class Task_39 {
    public static void main(String[] args) {
        int number;
        int sum=0;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            for(int i=1;i<=number;i++){
                 sum+=i;
            }
            System.out.println(sum);
        }
    }
}
