public class vowels {
    public void main(String[]args)
    {
       String str = "Priyadharshini";
       int count =0;
       for(int i=0 ; i<str.length(); i++)
       {
              if(str.charAt(i)=='a' ||str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u')
              {
                 count+=1;
                 
              }
        
        }
        System.out.println("The number of vowels in the string is " +count);
}
}