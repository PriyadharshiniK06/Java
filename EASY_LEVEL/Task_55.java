/*55.Check whether a number is perfect.
Input: 6
Output: Perfect Number */
import java.util.Scanner;
public class Task_55{
    public static void main(String[] args) {
        int number;
        int result=1;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            for(int i=2;i<number;i++){
                if(number%i==0){
                    result+=i;
                }
            }
            System.out.println(result);
        }
    }
}