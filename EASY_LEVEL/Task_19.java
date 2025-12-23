/*19.Read three numbers and print the largest.
Input: 4 9 2
Output: 9 */
import java.util.Scanner;
public class Task_19 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("Enter the three numbers: ");
        try(Scanner sc=new Scanner(System.in)){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(a>b && a>c){
                System.out.println(a);
            }
            else if (b>a && b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
    }
}
