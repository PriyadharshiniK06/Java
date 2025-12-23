/*12.Read days and convert into years, weeks, and days.
Input: 400
Output: 1 year 5 weeks 5 days */
import java.util.Scanner;
public class Task_12 {
    public static void main(String[] args) {
        System.out.print("Enter the days: ");
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            int year = number / 365;
            int remainder = number % 365;
            int week = remainder / 7;
            int days = remainder % 7;
            System.out.println(year + " year" + week + " week" + days + " days");
        }
    }
}
