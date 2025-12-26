/*51.Print Fibonacci series up to N terms.
Input: 5
Output: 0 1 1 2 3 */
import java.util.Scanner;
public class Task_51 {
    public static void main(String[]args){
    int number;
    int a=0,b=1,c;
    System.out.print("Enter the number: ");
    try(Scanner sc=new Scanner(System.in)){
         number=sc.nextInt();
         for(int i=1;i<=number;i++){
              System.out.print(a+" ");
              c=a+b;
              a=b;
              b=c;
         }
    }
}
}
