import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int divisor=1;
        int num=sc.nextInt();
        while(num/divisor>=10){
            divisor*=10;
        }
        int first=num/divisor;
        int last=num%10;
        if(first!=last){
            System.out.println("Not a palindrome number");
        }
        else{
            System.out.println("Palindrome number");
        }
        
    }
}
