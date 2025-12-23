/*11.Read temperature in Celsius and convert to Fahrenheit.
Input: 0
Output: 32*/
import java.util.*;
public class Task_11 {
    public static void main(String[]args){
         int cel;
         System.out.print("Enter the celsius temperature: ");
         try(Scanner sc=new Scanner(System.in)){
            cel=sc.nextInt();
            int fahrenheit=(9/5)*(cel+32);
            System.out.println(fahrenheit);
         }
    }
}
