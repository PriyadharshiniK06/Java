/*44.Reverse a number.
Input: 1234
Output: 4321*/
import java.util.Scanner;
public class Task_44 {
    public static void main(String[] args) {
        int number,reverse=0;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            for(;number>0;number/=10){
                reverse=(reverse*10)+(number%10);
            }
            System.out.println(reverse);
        }
    }
}
