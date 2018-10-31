//Imad Mashhood 2/8/18
import java.util.Scanner;
public class SalesTax
{
   public static void main(String[]args)
   {
      double StateTax;
      double CountyTax;
      double AmountPurchased;
      
      double SalesStateTax;
      double SalesCountyTax;
      
      double TotalTax;
      double TotalSale;
           
      StateTax = .04;
      CountyTax = .02;
      
    
      Scanner reader = new Scanner(System.in);
      System.out.println("Enter Amount Purchased: ");
      AmountPurchased = reader.nextDouble();
      
      SalesStateTax = StateTax*AmountPurchased;
      SalesCountyTax = CountyTax*AmountPurchased;
      
      TotalTax = SalesCountyTax+SalesStateTax;
      TotalSale =  TotalTax+AmountPurchased;
      
      System.out.println("You Purchased: $"+AmountPurchased+"\nTotal State Sales Tax: $"+SalesStateTax);
      System.out.println("Total County Sales Tax: $"+SalesCountyTax+"\nTotal Sales Tax: $"+TotalTax);
      System.out.println("Total Sale: $"+TotalSale);
      
      
   }
}
   