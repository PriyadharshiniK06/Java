/*33.Read gender and age, check marriage eligibility.
Input: Male 20
Output: Eligible*/
import java.util.Scanner;
public class Task_33 {
    public static void main(String[]args){
        int age;
        String gender;
        System.out.print("Enter your gender and age: ");
        try(Scanner sc=new Scanner(System.in)){
            gender=sc.next();
            age=sc.nextInt();
            if(gender.equalsIgnoreCase("Male") && age>=20 || gender.equalsIgnoreCase("Female") && age>=18 ){
                System.out.println("Eligible");
            }
            else{
                System.out.println("Not Eligible");
            }
        }
    }
}
