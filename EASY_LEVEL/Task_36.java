/*36.Print numbers from 1 to N.
Input: 5
Output: 1 2 3 4 5*/
import java.util.Scanner;
public class Task_36 {
    public static void main(String[] args) {
        int number,i;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            for(i=1;i<=number;i++){
                System.out.print(i+" ");
            }
        }
    }
}

