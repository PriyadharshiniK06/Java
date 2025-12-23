/*35.Read a number and check whether it lies between 1 and 100.
Input: 75
Output: Within Range*/
import java.util.Scanner;
public class Task_35 {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            a=sc.nextInt();
            if(a>=1 && a<=100){
                System.out.println("Within Range");
            }
            else{
                System.out.println("Not in the range");
            }
        }
    }
}
