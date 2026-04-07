import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int countodd=0;
        int counteven=0;
        while(num>0){
            int digit=num%10;
            if(digit%2==0){
                counteven+=1;
            }
            else{
                countodd+=1;
            }
            num/=10;
        }
        System.out.println(countodd+" "+counteven);
    }
}
