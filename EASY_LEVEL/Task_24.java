/*24.Read age and check eligibility to vote.
Input: 17
Output: Not Eligible*/
import java.util.Scanner;
public class Task_24 {
    public static void main(String[]args){
        int age;
        System.out.print("Enter your age: ");
        try(Scanner sc=new Scanner(System.in)){
              age=sc.nextInt();
              if(age>=18){
                System.out.println("Eligible");
              }
              else{
                System.out.println("Not Eligible");
              }
        }
    }
}
