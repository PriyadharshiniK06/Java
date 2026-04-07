import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int org=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }
        if(sum==org){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a strong number");
        }
        
    }
}
