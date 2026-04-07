import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        boolean duck=false;
        while(num>0){
            int digit=num%10;
            if(digit==0){
                duck=true;
                break;
            }
            num/=10;
        }
        if(duck){
            System.out.println("Duck number");
        }
        else{
            System.out.println("Not a duck number");
        }
        
    }
}
