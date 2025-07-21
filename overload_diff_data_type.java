class adders
{
    static int fun(int a, int b)
    {
        return a+b;
    }
    static double  fun(double a, double b)
    {
        return a+b;
    }
}
class overload_diff_data_type
{
    public static void main(String[]args)
    {
        System.out.println(adders.fun(2,8));
        System.out.println(adders.fun(0.5 , 8.5));
    }
}