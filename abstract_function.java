abstract class A{
     abstract void P();
}
class B extends A{
    void P()
    {
        System.out.println("Monday");
    }
}
class C extends A{
    void P(){
        System.out.println("Tuesday");
    }
}
class D extends A{
    void P()
    {
        System.out.println("Wednesday");
    }
}
class E extends A{
    void P()
    {
        System.out.println("Thursday");
    }
}
class J extends A{
    void P()
    {
        System.out.println("friday");
    }
}
class G extends A{
    void P()
    {
        System.out.println("saturday");
    }
}
class H extends A{
    void P()
    {
        System.out.println("Sunday");
    }
}
class abstract_function{
    public static void main(String[]args)
    {
        A obj;
        obj = new B();
        obj.P();
        obj = new C();
        obj.P();
        obj = new D();
        obj.P();
        obj = new E();
        obj.P();
        obj = new J();
        obj.P();
        obj = new G();
        obj.P();
        obj = new H();
        obj.P();
    }

}
