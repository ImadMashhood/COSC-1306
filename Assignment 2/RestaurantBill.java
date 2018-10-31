//Imad Mashhood 2/8/18
import java.util.Scanner;
public class RestaurantBill
{
   public static void main(String[]args)
   {
      double Tax;
      double Tip;
      
      Tax = .0675;
      Tip = .2;
      
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter Price of Meal: ");
      double MealPrice = reader.nextDouble();
      
      double MealTax;
      double MealTip;
      double TotalBill;
      MealTax = Tax*MealPrice;
      MealTip = (MealTax+MealPrice)*Tip;
      TotalBill = MealTax+MealTip+MealPrice;
      
      System.out.println("\nPrice of the Meal: "+MealPrice+"\nTax on the Meal: "+MealTax);
      System.out.println("Amount of Tip: "+MealTip+"\nTotal Bill: "+TotalBill);

   }
}
      