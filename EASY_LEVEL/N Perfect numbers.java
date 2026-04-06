import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        for(int i=1;i<=a;i++){
           int divisor=0;
           for(int j=1;j<=i/2;j++){
              if(i%j==0){
                divisor+=j;
              }
            }
            if(divisor==i){
            System.out.print(i+" ");
            }
        }
    }
}
