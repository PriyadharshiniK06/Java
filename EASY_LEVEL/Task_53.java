/*53.Count even and odd digits in a number.
Input: 1234
Output: Even: 2 Odd: 2*/
import java.util.Scanner;
public class Task_53 {
    public static void main(String[]args){
        int number;
        int counteven=0;
        int countodd=0;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            while(number>0){
                int digit=number%10;
                if(digit%2==0){
                    counteven+=1;
                }
                else{
                    countodd+=1;
                }
            }
            System.out.print("Even: "+counteven+" Odd: "+countodd);
        }


    }
}
