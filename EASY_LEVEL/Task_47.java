/*47.Find GCD of two numbers.
Input: 12 18
Output: 6*/
import java.math.BigInteger;
import java.util.*;
public class Task_47{
    public static void main(String[]args){
        int number1,number2;
        System.out.print("Enter the two numbers: ");
        try(Scanner sc=new Scanner(System.in)){
            number1=sc.nextInt();
            number2=sc.nextInt();
            BigInteger big1=BigInteger.valueOf(number1);
            BigInteger big2=BigInteger.valueOf(number2);
            int gcd=big1.gcd(big2).intValue();
            System.out.println(gcd);
        }
    }
}
