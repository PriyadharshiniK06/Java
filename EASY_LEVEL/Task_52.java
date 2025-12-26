/*52.Find power of a number without using Math.pow().
Input: 2 3
Output: 8*/
import java.util.Scanner;
public class Task_52 {
    public static void main(String[]args){
        int a,b;
        System.out.print("Enter the two numbers: ");
        try(Scanner sc=new Scanner(System.in)){
            a=sc.nextInt();
            b=sc.nextInt();
            int result=1;
            for(int i=1;i<=b;i++){
                 result*=a;
            }
            System.out.println(result);
        }
    }
}
