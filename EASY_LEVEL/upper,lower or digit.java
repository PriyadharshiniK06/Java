import java.util.*;
class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         char ch=sc.next().charAt(0);
         if(Character.isUpperCase(ch)){
             System.out.println("Uppercase");
         }
         else if(Character.isLowerCase(ch)){
             System.out.println("Lowercase");
         }
         else if(Character.isDigit(ch)){
             System.out.println("Digit");
         }
        else{
             System.out.println("Special Character");
         }
         
    }
}
