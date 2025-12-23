/*27.Read a number and check whether it is a 3-digit number.
Input: 456
Output: Three-digit number*/
import java.util.Scanner;
public class Task_27 {
    public static void main(String[]args){
        int number;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            String n=Integer.toString(number);
            if(n.length()==3){
                System.out.println("Three-digit number");
            }
            else{
                System.out.println("Not a Three-digit number");
            }
        }
    }
    
}
