/*57.Find sum of even numbers up to N.
Input: 10
Output: 30 */
import java.util.Scanner;
public class Task_57 {
    public static void main(String[]args){
    int number;
    int sum=0;
    try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter the number: ");
        number=sc.nextInt();
        for(int i=1;i<=number;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

}
