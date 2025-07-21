class A
{
    int fun(int a , int b)
    {
        return a+b;
    }
    double fun(double a , double b)
    {
        return a-b;
    }
    int fun(int c , int d)
    {
        return a*b;
    }
    double fun(double c, double d){
        return a/b;
    }
    
}
class same_function
{

    A obj = new A();
    System.out.println(pbj.fun(12,21));
    System.out.println(pbj.fun(12,30));
    System.out.println(pbj.fun(12,3));
    System.out.println(pbj.fun(12,3));

}
