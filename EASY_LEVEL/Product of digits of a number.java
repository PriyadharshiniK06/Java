import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int product=1;
        if(num==0){
          System.out.println("0");}
        while(num>0){
            int digit=num%10;
            product*=digit;
            num/=10;
        }
        System.out.println(product);
        
    }
}
