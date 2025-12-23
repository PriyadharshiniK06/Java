/*28.Read salary and calculate bonus (10% if salary > 50,000).
Input: 60000
Output: Bonus: 6000*/
import java.util.Scanner;
public class Task_28 {
    public static void main(String[] args) {
        int salary;
        System.out.print("Enter your salary: ");
        try(Scanner sc=new Scanner(System.in)){
            salary=sc.nextInt();
            if(salary<=50000){
                System.out.println("Bonus: 0");
            }
            else{
                int bonus=(int) (salary * 0.10);
                System.out.println("Bonus: "+bonus);
            }
        }
    }
}
