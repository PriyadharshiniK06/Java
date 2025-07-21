interface par1{
    void fun();
}
interface par2{
    void func();
}
class A implements par1,par2{
    public void fun(){
        System.out.println("Monday");
    }  
    public void func(){
        System.out.println("Tuesday");
    }
}

class Multiple_inheritance{
     public static void main(String[]args)
     {
        par1 obj1 = new A();
        par2 obj2=new A();
        obj1.fun();
        obj2.func();
        
        
     }
}