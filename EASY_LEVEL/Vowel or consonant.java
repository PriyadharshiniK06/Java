import java.util.*;
class Main {
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0); 
char character= Character.toLowerCase(ch); 
System.out.println(((character=='a') || (character=='e') || (character=='i')||(character=='o')||(character=='u')) ? "Vowel": "Consonant"); 
}
}
