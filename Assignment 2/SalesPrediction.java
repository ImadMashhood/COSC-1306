//Imad Mashhood 2/8/18
public class SalesPrediction
{
   public static void main(String[] args)
   {
      double PercOfSales;
      double Revenue;
      double SalesPred;
      
      PercOfSales = .62;
      Revenue = 46000000;
      SalesPred = PercOfSales*Revenue;
      //System.out.println("East Coast Sales Prediction is $"+PercOfSales*Revenue); 
      //                        ^Would running this work too?^
      System.out.println("East Coast Sales Prediction is $"+SalesPred);
   }
}