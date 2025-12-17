/*1.A student enters their name. Write a program to display “Hello <name>”.
Input: Priya
Output: Hello Priya*/
import java.util.Scanner;
class Task_1{
    public static void main(String[]args){
        String name;
        try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter your name : ");
        name=sc.nextLine();
        System.out.println("Hello "+name);
        }
    }
}