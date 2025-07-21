class hierchical
{
    int a=89;
}
class a1 extends hierchical {
    int b=78;
}
class a2 extends  hierchical{
    int c=90;
}
class a3 extends hierchical {
    int d =67;
}
class a4 extends hierchical {
    int e =45;
    public static void main(String[]args)
    {
        a4 obj= new a4();
        System.out.println("The a integer is : "+obj.a);
        a1 object= new a1();
        System.out.println("The b integer is : "+object.b);
        a2 ob= new a2();
        System.out.println("The c integer is : "+ob.c);
        a3 obje = new a3();
        System.out.println("The d integer is : "+obje.d);
        System.out.println("The e integer is : "+obj.e);
    }
}