/*49.Check whether a number is prime.
Input: 13
Output: Prime*/
import java.util.Scanner;
public class Task_49 {
    public static void main(String[]args){
        int number;
        boolean primes=true;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    primes=false;
                }
            }
            if(primes==true){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }
}
