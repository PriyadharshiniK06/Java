class adder
{
    public int fun(int a , int b)
    {
        return a+b;
    }
    public double fun(double a, double b)
    {
        return a+b;
    }

}
class overload_public_diff_data_type
{
    public static void main(String[]args)
    {
        adder obj = new adder();
        System.out.println(obj.fun(11,22));
        System.out.println(obj.fun(1.1,3.3));
    }
}