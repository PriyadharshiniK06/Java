public class fibonacci_series
{
    public void main(String[]args)
    {
        int a=0,b=1,c;
        int i;
        for(i=1;i<20;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}