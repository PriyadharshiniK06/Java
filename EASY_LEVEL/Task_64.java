/*Count vowels in a string 
Input: education
Output: 5*/
import java.util.Scanner;
public class Task_64 {
    public static void main(String[]args){
        String strings;
        int count=0;
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the string: ");
            strings=sc.next();
            String lower=strings.toLowerCase();
            for(int i=0;i<lower.length();i++){
                 char ch=lower.charAt(i);
                 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch == 'I' || ch=='U' || ch=='O'){
                    count+=1;
                 }
            }
            System.out.print(count);
        }
    }
}
