public class array_2_dimensional
{
    public void main(String[]args)
    {
        int i,j,arr[][]={{1,3,4,6},{4,8,9,7}};
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.println("arr"+"["+ i +"]"+"[" +j+"]" +"=" + arr[i][j]);
            }
        }
    }
}