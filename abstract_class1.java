abstract class A{
   abstract  void Gi(int a,int b);
}
class B extends A{
      void Gi(int a , int b)
      {
         System.out.println(a + b);
      }
}
class C extends A{
    void Gi(int a,int b)
    {
        System.out.println(a -b);
    }
}
class D extends A{
    void Gi(int a , int b)
    {
        System.out.println(a * b);
    }
}
class abstract_class1 {
    public static void main (String[]args)
    {
        A obj;
        obj = new B();
        obj.Gi(34,45);
        obj = new C();
        obj.Gi(49,59);
        obj = new D();
        obj.Gi(23,89);
    }
}