import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int find=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        while(a<=find){
            if(a==find){
                System.out.println("Yes");
            }
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("No");
        
    }
}
