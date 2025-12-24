/*43.Find sum of digits of a number.
Input: 123
Output: 6*/
import java.util.Scanner;
public class Task_43 {
    public static void main(String[]args){
        int number,sum=0;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            for(;number>0;number/=10){
                sum+=(number%10);
            }
            System.out.println(sum);
        }
    }
}
