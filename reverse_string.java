import java.util.Scanner;
class reverse_string
{
    public static void main(String[]args)
    {
        System.out.print("The original string is : ");
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        String reversedstring =new StringBuilder(str).reverse().toString();
        System.out.println("the reversed string is : " +reversedstring);
    }
}