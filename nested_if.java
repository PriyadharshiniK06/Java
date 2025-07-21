public class nested_if
{
    public void main(String[]args)
    {
        int sp=390;
        int cp=900;
        if(sp>cp)
        {
            if(sp>350)
            {
                System.out.println("Tell my purchase is profit");
            }
            else
            {
                System.out.println("Tell it is a profit");
            }
            
        }
        else
        {
            System.out.println("Tell it is a loss");
        }
        
    }
}