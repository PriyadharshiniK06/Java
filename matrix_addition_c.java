class matrix_addition_c
{
    public void main(String[]args)
    {
        int i,j,arr1[][]={{1,2,6,4},{5,9,7,8}},arr2[][]={{9,8,2,5},{7,3,4,2}},arr3[][]=new int[2][4];
        for(i=0;i<2;i++)
        {
            for(j=0;j<4;j++)
            {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+ " ");
            }
        }
        
       
    }
}