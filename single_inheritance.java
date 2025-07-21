class salary
{
    float salary=60000;
}
class single_inheritance extends salary{
    int bonus=13000;
    public static void main(String[]args){
        bonus obj = new  bonus();
        System.out.println("The salary is : "+obj.salary);
        System.out.println("The bonus amount is : "+ obj.bonus);
    }
}