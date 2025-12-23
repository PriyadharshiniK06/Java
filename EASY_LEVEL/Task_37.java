/*37.Print even numbers up to N.
Input: 10
Output: 2 4 6 8 10*/
import java.util.Scanner;
public class Task_37 {
    public static void main(String[]args){
        int number;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            for(int i=1;i<=number;i++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
