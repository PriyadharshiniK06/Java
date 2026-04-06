import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        for(int i=2;i<=num;i++){
            int count=0;
             for(int j=2;j<=Math.sqrt(i);j++){
                  if(i%j==0){
                    count+=1;
                    break;
                  }
              }
             if(count==0){
                System.out.print(i+" ");
        }
        }
       
        
    }
}
