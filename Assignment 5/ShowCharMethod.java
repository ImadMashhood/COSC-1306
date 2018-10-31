//Imad Mashhood 4/5/18
import java.util.Scanner;
public class ShowCharMethod
{
   public static void main(String[]args)
   {  
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String: ");
      String word = sc.nextLine();
      int num= 0;
      System.out.println("Enter a Number Less Than or Equal to The Length of the String: ");
      num = sc.nextInt();
      while(num > word.length())
      {
         System.out.println("Number Bigger than String Length");
         System.out.println("Enter a Number Less Than or Equal to The Length of the String");
         num = sc.nextInt();
      }
      ShowChar(num, word);
   }
   
   public static void ShowChar(int num, String word)
   {
            
      char cha = word.charAt(num);
      System.out.println(cha);
      
   }
}