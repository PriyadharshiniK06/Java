/*41.Print multiplication table of a number.
Input: 3
Output: 3 6 9 12 15*/
import java.util.Scanner;
public class Task_41 {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            for(int i=1;i<=5;i++){
                System.out.print(number*i+" ");
            }
        }
    }
}
