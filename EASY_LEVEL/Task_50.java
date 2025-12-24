/*50.Print all prime numbers up to N.
Input: 10
Output: 2 3 5 7*/
import java.util.Scanner;
public class Task_50 {
    public static void main(String[]args){
        int number;
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number: ");
            number=sc.nextInt();
            for(int i=2;i<=number;i++){
                boolean primes=true;
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        primes=false;
                    }
                }
                if(primes==true){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
