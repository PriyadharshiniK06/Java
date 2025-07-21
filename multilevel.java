class par
{
    int a=678;
}
class child1 extends par
{
   int b=569;
}
class Multilevel extends child1{
    public static void main(String[]args){
    ch2 obj = new ch2();
    System.out.println("the a variable is "+ obj.a);
    System.out.println("The b variable is "+ obj.b);
    Sytem.out.println("the c variable is "+ obj.c);
    }
}