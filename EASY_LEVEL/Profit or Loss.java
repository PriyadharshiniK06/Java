import java.util.*;
class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int cp=sc.nextInt();
         int sp=sc.nextInt();
         if(cp>sp){
             System.out.println("Loss");
         }
         else if(sp>cp){
             System.out.println("Profit");
         }
         else{
             System.out.println("No Profit No loss");
         }
        
    }
}
