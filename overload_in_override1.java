class adder
{
    public int fun(int a , int b)
    {
        return a+b;
    }
}
class sub extends adder
{    
    public int fun(int a, int b)
    {
        return a+b;
    }

}
class overload_in_override1{
    public static void main(String[]args)
    {
        adder a= new adder();
        sub b =  new sub();
        System.out.println(a.fun(10,15));
        System.out.println(b.fun(20,25));

    }
}