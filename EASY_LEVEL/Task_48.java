/*48.Find LCM of two numbers.
Input: 4 6
Output: 12 */
import java.util.*;
import java.math.BigInteger;
public class Task_48 {
    public static void main(String[] args) {
        int number1,number2,lcm,gcd;
        BigInteger Big1,Big2;
        System.out.print("Enter the two numbers: ");
        try(Scanner sc=new Scanner(System.in)){
            number1=sc.nextInt();
            number2=sc.nextInt();
            Big1=BigInteger.valueOf(number1);
            Big2=BigInteger.valueOf(number2);
            gcd=Big1.gcd(Big2).intValue();
            lcm=(number1*number2)/gcd;
            System.out.println(lcm);
        }
    }
}
