public class print_age_and_name_with_object
{
    int age;
    String name;
    public void main(String[]args)
    {
        print_age_and_name_with_object obj = new print_age_and_name_with_object();

        obj.age=23;
        obj.name="alan";

        System.out.println(obj.age);
        System.out.println(obj.name);
    }
}