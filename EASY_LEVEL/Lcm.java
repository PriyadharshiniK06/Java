import java.util.*; 
class Main { 
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in);
int a=sc.nextInt(); 
int b=sc.nextInt();
int small=a;
if(b<small){
small=b; 
}
int gcd=0; 
for(int i=1;i<=small;i++){ 
if(a%i==0 && b%i==0){ 
gcd=i; 
}
}
int lcm=a*b/gcd; 
System.out.println(lcm);
}
}
