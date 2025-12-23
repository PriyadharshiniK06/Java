/*30.Read electricity units and calculate bill (simple slabs).
Input: 120
Output: Bill Amount: 240*/
import java.util.Scanner;
public class Task_30 {
    public static void main(String[] args) {
        int units;
        System.out.print("Enter the electricity units: ");
        try(Scanner sc=new Scanner(System.in)){
            units=sc.nextInt();
            System.out.println("Bill Amount: "+(units*2));
        }
    }
}
