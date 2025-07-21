class A
{
    void run(int a , int b)
    {
        System.out.println(a+b);
    }
}
class b
{
    void run(int a,int b)
    {
        System.out.println(a-b);
    }
}
class polymorphism_fun_overloading
{
    public static void main(String[]args)
    {
    A obj = new A();
    b object= new b();
    obj.run(12,21);
    object.run(13,23);
    }
    
}