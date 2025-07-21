public class object_creation{
    public void fun(){
        System.out.println("Thursday");

    }
    public void speed(int speed){
        System.out.println("Speed is  "+speed);
    }
    public static void main(String[]args)
    {
        object_creation obj =new object_creation();
        obj.fun();
        obj.speed(80);
    }
}