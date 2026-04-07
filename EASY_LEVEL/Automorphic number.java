import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int org=num;
        int square=num*num;
        while(num>0){
            if((num%10)!=(square%10)){
                System.out.println("Not An automorphic number");
                return;
            }
            num/=10;
        }
        System.out.println("Automorphic number");
        
        
    }
}
