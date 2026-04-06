import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int total=sc.nextInt();
        for(int i=1;i<=total;i++){
            System.out.print((number*i)+" ");
        }
        
    }
}
