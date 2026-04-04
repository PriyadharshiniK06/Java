import java.util.*;
class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         int d=(b*b)- 4*a*c;
         if(d>0){
             double r1 = (-b + Math.sqrt(d))/(2*a);
             double r2 = (-b - Math.sqrt(d))/(2*a);
             System.out.println("Two real roots "+r1+" and "+r2);
         }
         else if(d==0){
             double r= -b/(2.0*a);
             System.out.println("One real root: "+r);
         }
         else{
             System.out.println("Complex roots");
         }
       
         
    }
}
