
import java.util.Scanner;

public class Main
{
   public static void main(String args[])
   {
       String str, r;
       Scanner s = new Scanner(System.in);
      
       str = s.nextLine();

       r = removeVowels(str);
	   
       System.out.print(r);
   }

   public static String removeVowels(String ss)
   {
     String finalString = "";
     int i;
     for(i=0; i<ss.length(); i++)
     {
       if (!isVowel(Character.toLowerCase(ss.charAt(i))))
       {
         finalString = finalString + ss.charAt(i);
       }
     }
     return finalString;
   }

   public static boolean isVowel(char c)
   {
     String vowels = "aeiou";
     int i;
     for(i=0; i<5; i++)
     {
       if(c == vowels.charAt(i))
       {
         return true;
       }
     }
     return false;
   }
}