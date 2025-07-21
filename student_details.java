public class student_details
{
    int register_no1;
    String Department1;
    String Name1;
    int register_no2;
    String Department2;
    String Name2;
    int register_no3;
    String Department3;
    String Name3;

    void myfun()
    {
        System.out.println("Function");
    }
    public static void main(String[]args)
    {
        student obj= new student();
        obj.Name1="Priya";
        obj.Name2="Dharshini";
        obj.Name3="Harshini";
        obj.Department1="CSE";
        obj.Department2="ECE";
        obj.Department3="EEE";
        obj.register_no1=2345654;
        obj.register_no2=4568904;
        obj.register_no3=6784563;
        System.out.println("The first student details are :");
        System.out.println("Name : "+obj.Name1);
        System.out.println("Department : " + obj.Department1);
        System.out.println("Register No : " + obj.register_no1);
        System.out.println("The second student details are :");
        System.out.println("Name : " + obj.Name2);
        System.out.println("Department : " + obj.Department2);
        System.out.println("Register No : " + obj.register_no2);
        System.out.println("The third student details are :");
        System.out.println("Name : " + obj.Name3);
        System.out.println("Department : " + obj.Department3);
        System.out.println("Register No : " + obj.register_no3); 
        obj.myfun();

    }

}