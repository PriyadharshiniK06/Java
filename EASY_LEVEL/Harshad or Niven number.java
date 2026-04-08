import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int original=number;
        int sum=0;
        while(number>0){
            int digit=number%10;
            sum+=digit;
            number/=10;
        }
        if(original%sum==0){
            System.out.println("Niven or hashad number");
        }
        else{
            System.out.println("Not a niven number");
        }
    }
}
