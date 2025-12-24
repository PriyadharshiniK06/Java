/*46.Check whether a number is an Armstrong number.
Input: 153
Output: Armstrong Number*/
import java.util.*;
public class Task_46 {
    public static void main(String[] args) {
        int number,original,length,digit_power,digit=0;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            String strings=Integer.toString(number);
            original=number;
            length=strings.length();
            for(;number>0;number/=10){
                 digit_power=(int) (Math.pow((number%10),length));
                 digit+=digit_power;
            }
            if(digit==original){
                System.out.println("Armstrong");
            }
            else{
                System.out.println("Not Armstrong");
            }
        }
    }
}
