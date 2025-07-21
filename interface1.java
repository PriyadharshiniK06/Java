interface K
{
    void fun();
}
class P implements K{
    public void fun()
    {
        System.out.println("Tuesday");
    }
}
class O implements K{
    public void fun(){
        System.out.println("Evening");
    }
}
class interface1 {
    public static void main(String[]args){
       K obj;
       obj = new P();
       obj.fun();
       obj = new O();
       obj.fun();
    }
}