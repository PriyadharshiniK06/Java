import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0;
        while(number>0){
            count+=1;
            number/=10;
        }
        System.out.println(count);
    }
}
