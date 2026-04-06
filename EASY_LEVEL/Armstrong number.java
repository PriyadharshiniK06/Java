import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int org=num;
        String lengths=""+num;
        int sum=0;
        int power=lengths.length();
        while(num>0){
            int digit=num%10;
            sum+=(int)Math.pow(digit,power);
            num/=10;
        }
        if(org==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
