import java.util.Arrays;
import java.util.Collections;
class ascending_descending
{
    public static void main(String[]args)
    {
        Integer[] a = {23,89,45,12};
        Arrays.sort(a);
        System.out.println("The array in ascending order is  "+Arrays.toString(a));
        Arrays.sort(a ,Collections.reverseOrder());
        System.out.println("The array in reverse order is "+ Arrays.toString(a));
    }
}