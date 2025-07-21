class par {
    void run(int a,int b)
    {
        System.out.println(a+b);
    }

    void run(int a, int b ,int c)
    {
        System.out.println(a+b+c);
    }

    void run(int a,int b,int c,int d)
    {
        System.out.println(a+b+c+d);
    }

    void run(double a, double b , double c){
        System.out.println(a+b+c);
    }
}
class override_in_overload1
{
    public static void main(String[]args)
    {
        par a = new par();
        a.run(12,14);
        a.run(12,15,17);
        a.run(12,15,18,20);
        a.run(5.67, 4.89, 9.56);
    }
}