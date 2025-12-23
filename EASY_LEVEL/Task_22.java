/*22.Read marks and print grade.
Input: 85
Output: Grade A */
import java.util.Scanner;
public class Task_22 {
    public static void main(String[] args) {
        int mark;
        System.out.print("Enter the mark: ");
        try(Scanner sc=new Scanner(System.in)){
            mark=sc.nextInt();
            if(mark<=35){
                System.out.println("Grade F");
            }
            else if(mark>=36 && mark<=45){
                System.out.println("Grade E");
            }
            else if(mark>=46 && mark<=55){
                System.out.println("Grade D");
            }
            else if(mark>=56 && mark<=60){
                System.out.println("Grade C");
            }
            else if(mark<=61 && mark<=75){
                System.out.println("Grade B");
            }
            else if(mark>=76 && mark<=90){
                System.out.println("Grade A");
            }
            else{
                System.out.println("Grade O");
            }
            
        }
    }
}
