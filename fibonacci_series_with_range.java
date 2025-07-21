public class fibonacci_series_with_range
{
    public void main(String[]args)
    {
        int a;
        int b=0;
        int c;
        int range=89;
        for(a=0;a<range;a++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}