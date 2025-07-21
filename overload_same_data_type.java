class adder{
    static int fun(int a, int b)
    {
        return a+b;
    }
    static int fun(int a, int b , int c)
    {
        return a+b+c;
    }
}
class overload_same_data_type
{
    public static void main(String[]args)
    {
        System.out.println(adder.fun(2,7));
        System.out.println(adder.fun(2,7,5));
    }
}