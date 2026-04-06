import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int divisor=0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                divisor+=i;
            }
        }
        if(divisor==a){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a perfect Number");
        }
    }
}
