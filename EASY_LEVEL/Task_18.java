/*18.Read two numbers and print the greatest one.
Input: 8 12
Output: 12 */
import java.util.Scanner;
public class Task_18 {
    public static void main(String[] args) {
        int a,b;
        System.out.print("Enter the two numbers: ");
        try(Scanner sc=new Scanner(System.in)){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a>b){
                System.out.println(a);
            }
            else{
                System.out.println(b);
            }
        }
    }
}
