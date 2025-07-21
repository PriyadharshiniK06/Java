public class constructor2
{
    int age;
    String name;
    public constructor2(int age,String name)
    {
        this.age=age;
        this.name=name;
        System.out.println(age);
        System.out.println(name);

    }
    public void fun()
    {
        System.out.println(age);
        System.out.println(name);
    }
    public static void main (String[]args)
    {
        constructor2 obj = new constructor2(56,"priya");
        obj.fun();
    }
}