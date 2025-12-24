/*42.Count digits in a number.
Input: 4567
Output: 4*/
import java.util.Scanner;
public class Task_42 {
    public static void main(String[] args) {
        int number,count=0;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            for(;number>0;number/=10){
                count+=1;
            }
            System.out.print(count);
        }

    }
}
