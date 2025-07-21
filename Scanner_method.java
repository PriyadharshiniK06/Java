import java.util.Scanner;
class Scanner_method
{
    public static void main(String[]args)
    {
        Scanner obj= new Scanner (System.in);
        System.out.print("Enter your name: ");
        String  name= obj.nextLine();
        System.out.print("Enter your age: ");
        int age = obj.nextInt();
        System.out.print("Enter any boolean value: ");
        Boolean bool=obj.nextBoolean();
        System.out.print("Enter a byte value: ");
        int byt=obj.nextByte();
        System.out.print("Enter a double number: ");
        Double dou = obj.nextDouble();
        System.out.print("Enter a float value: ");
        Float flo = obj.nextFloat();
        System.out.print("Enter any long integer :");
        Long lon=obj.nextLong();
        
        System.out.println("My name is  " + name);
        System.out.println("My age is "+age);
        System.out.println("Tne boolean value is :"+ bool);
        System.out.println(byt);
        System.out.println(dou);
        System.out.println(flo);
        System.out.println(lon);
        
        

    }
}