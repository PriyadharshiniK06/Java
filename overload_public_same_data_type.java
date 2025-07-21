class adder
{
    public int fun(int a , int b)
    {
        return a+b;
    }
    public int fun(int a, int b, int c)
    {
        return a+b+c;
    }

}
class overload_public_same_data_type
{
    public static void main(String[]args)
    {
        adder obj = new adder();
        System.out.println(obj.fun(11,22));
        System.out.println(obj.fun(11,22,33));
    }
}