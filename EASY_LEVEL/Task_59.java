/*59.Check whether a number is a strong number.
Input: 145
Output: Strong Number*/
import java.util.Scanner;
public class Task_59 {
    public static void main(String[]args){
        int number;
        int sum=0;
        int digit;
        int original;
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter the number: ");
            number=sc.nextInt();
            original=number;
            for(;number>0;number/=10){
                digit=(number%10);
                int fact=1;
                for(int i=1;i<=digit;i++){
                    fact*=i;
                }
                sum+=fact;
            }
        }
        if(sum==original){
            System.out.print("Strong number");
        }
        else{
            System.out.print("Not Strong Number");
        }
    }
}
