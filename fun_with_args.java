public class fun_with_args{
    public void fun()
    {
        System.out.println("Monday");
    }
    public void func(int a, int b)
    {
        System.out.println(a);
    }
    public int funct()
    {
        return 78;
    }
    public int functi(int a)
    {
        return a+4;
    }
    public static void main(String[]args)
    {
        fun_with_args obj=new fun_with_args();
        obj.fun();
        obj.func(56,78);
        System.out.println(obj.funct());
        System.out.println(obj.functi(59));

    }
}