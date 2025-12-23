/*38.Print odd numbers up to N.
Input: 7
Output: 1 3 5 7*/
import java.util.Scanner;
public class Task_38 {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the number: ");
        try(Scanner sc=new Scanner(System.in)){
            number=sc.nextInt();
            for(int i=1;i<=number;i++){
                if(i%2!=0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
