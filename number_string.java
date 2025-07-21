import java.util.Scanner;
class number_value
{
    public static void main(String[]args)
    {
        System.out.print("Enter any number b/w 1-5: ");
        Scanner obj =new Scanner(System.in);
        int number = obj.nextInt();
        switch(number)
        {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;        

               
        }
    }
}