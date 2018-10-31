//Imad Mashhood 2/8/18
import java.util.Scanner;
public class IngredientAdjuster
{
   public static void main(String[]args)
   {
      double sugar;
      double butter;
      double flour;
      double cookies;
      
      sugar = 1.5;
      butter = 1.0;
      flour = 2.75;
      cookies = 48;
      
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter Amount of Cookies You Will Make: ");
      int CookiesBeingMade = reader.nextInt();
      
      double Frac = CookiesBeingMade/cookies;
      double FracSugar = Frac*sugar;
      double FracButter = Frac*butter;
      double FracFlour = Frac*flour;
      
      System.out.println("For "+CookiesBeingMade+" Cookies You Will Need ");
      System.out.println(FracSugar+" Cups of Sugar\n"+FracButter+" Cups of Butter\n"+FracFlour+" Cups of Flour");
   }
}
      
      
      
      