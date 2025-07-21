public class constructor_with_function
{
    int x,y;
    public constructor_with_function(int x,int y)
    {
       this.x=x;
        this.y=y;
        System.out.println("f x is "+x);
        System.out.println("f y is "+y);
       
    }
    public void func()
    {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[]args)
    {
        constructor_with_function obj= new constructor_with_function(34,56);
       
        obj.func();
        


    }
}