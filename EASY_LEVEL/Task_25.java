/*25.Read a number and check whether it is a multiple of 3.
Input: 18
Output: Multiple of 3*/
import java.util.Scanner;
public class Task_25 {
    public static void main(String[] args) {
          int number;
          System.out.print("Enter the number: ");
          try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            if(number%3==0){
                System.out.println("Multiple of 3");
            }
            else{
                System.out.println("Not a Multiple of 3");
            }
          }   
    }
}
