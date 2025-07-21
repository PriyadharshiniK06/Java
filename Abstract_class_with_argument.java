abstract class Aarg{
    abstract  void Gi(int a , int b);
 }
 class B extends Aarg{
       void Gi(int a , int b)
       {
          System.out.println(a + b);
       }
 }
 class C extends Aarg{
     void Gi(int a,int b)
     {
         System.out.println(a - b);
     }
 }
 class D extends Aarg{
     void Gi(int a , int b)
     {
         System.out.println(a * b);
     }
 }
 class Abstract_class_with_argument
  {
     public static void main(String[]args)
     {
         Aarg obj;
         obj = new B();
         obj.Gi(34,45);
         obj = new C();
         obj.Gi(49,59);
         obj = new D();
         obj.Gi(23,89);
     }
 }