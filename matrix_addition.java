public class matrix_addition
{
    public void main(String[]args)
    {
        int  a[][] = {{2,3,5},{1,2,7}} , b[][] = {{1,5,7},{2,4,6}}, c[][]= new int [2][3];
        int i,j;
        System.out.println("The elements of a are ");
        for(i=0;i<2;i++){
            for(j=0;j<a[i].length;j++)
        {
            System.out.println("a["+i+"]"+"["+j+"]" +"=" +a[i][j]);
        }
        }
        
        System.out.println("The elements of b are ");
        for(i=0;i<2;i++){
            for(j=0;j<b[i].length;j++)
        {
            System.out.println("b["+i+"]"+"["+j+"]" +b[i][j]);
        }
            
        }
        
        System.out.println("The elements of c are ");
        for(i=0;i<2;i++){
            for(j=0;j<c[i].length;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println("c["+i+"]"+"["+j+"]" +c[i][j]);
            }  
        }
        
        
    }
}