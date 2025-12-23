/*20.Check whether a year is a leap year.
Input: 2024
Output: Leap Year */
import java.util.Scanner;
public class Task_20 {
    public static void main(String[]args){
        int year;
        System.out.print("Enter the year: ");
        try(Scanner sc=new Scanner(System.in)){
            year=sc.nextInt();
            if(year%4==0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }
    }
}
