public class constructor
{
    int age;
    String name;
    public constructor(int age,String name)
    {
        this.age=age;
        this.name=name;

    }
    public void fun()
    {
        System.out.println(age);
        System.out.println(name);
    }
    public static void main (String[]args)
    {
        constructor obj = new constructor(56,"priya");
        obj.fun();
    }
}