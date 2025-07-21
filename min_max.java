class min_max
{
    public static void main(String[]args){
   int a[] = {23,45,12,25};
   int min= a[0];
   int max= a[0];
   for (int i=1; i<a.length;i++)
   {
      if( a[i] <min)
      {
         min = a[i];
      }
      if (a[i] > max)
      {
        max = a[i];
      }

   }
       System.out.println(min);
       System.out.println(max);
   }
}