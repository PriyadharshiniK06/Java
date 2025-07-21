import java.util.Scanner;
public class length_of_a_string
{
    public static void main(String[]args)
    {
       System.out.print("Enter the String to be counted  ");
       Scanner obj = new Scanner(System.in);
       String Str = obj.nextLine();
       int i = Str.length();
       System.out.println(i);
    }
}