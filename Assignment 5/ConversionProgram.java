//Imad Mashhood 3/1/18
import java.util.Scanner;
public class ConversionProgram
{
   public static void main(String[]args)
   {  
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Distance in Meters: ");
      double meters = sc.nextDouble();
      while(meters<=0)
      {
         System.out.println("Distance Can Not be Negative");
         System.out.println("Enter a Positive Distance in Meters: ");
         meters = sc.nextDouble(); 
      }
      sc.nextLine();//Was being weird and running the loop twice
      while(1==1)
      {
         System.out.println("What Would you like to do?\n1. Convert to Kilometers\n2. Convert to Inches\n3. Convert to Feet\n4. Quit");
         String Option = sc.nextLine();
         if (Option.contains("4")||Option.toLowerCase().contains("quit"))
            {
               System.out.println("\nThank You Have  Nice Day");
               break;
            }
         else if (Option.contains("3")||Option.toLowerCase().contains("feet"))
            showFeet(meters);
         else if (Option.contains("2")||Option.toLowerCase().contains("inches"))
            showInches(meters);
         else if (Option.contains("1")||Option.toLowerCase().contains("kilo"))
            showKilometers(meters);
         else
            System.out.println("Not a Valid Input Please Try Again");
            
      }
   }
   public static void showFeet(double meters)
   { 
      double feet = meters*3.28084;
      System.out.println(meters+" m is "+feet+" ft\n");
   }
      public static void showInches(double meters)
   { 
      double inch = meters*39.3701;
      System.out.println(meters+" m is "+inch+" in\n");
   }
      public static void showKilometers(double meters)
   { 
      double kilo = meters*.001;
      System.out.println(meters+" m is "+kilo+" km\n");
   }
}   