import java.util.*;
class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int unit=sc.nextInt();
         if(unit<=100){
            System.out.println((unit*5));
         }
         else if(unit<=200){
             System.out.println((double) (100*5)+(unit-100)*7);
         }
         else{
             System.out.println((double) (100*5)+(100*7)+(unit-200)*10);
         }
        
    }
}
