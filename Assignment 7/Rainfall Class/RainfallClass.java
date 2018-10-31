//Imad Mashhood 4/19/18
import java.util.Scanner;
public class RainfallClass
{
   public static void main( String []args)
   {
      Scanner sc = new Scanner(System.in);
      int a = 0;
      
      double [] rainInp = new double [12];
      
      while(a<12)
      {
         int month = a+1;
         System.out.println("Enter Rain For Month "+month);
         double inp = sc.nextDouble();
         while(inp<0)
         {
            System.out.println("Invalid Input Please Try Again");
            System.out.println("Enter Rain For Month "+month);
            inp = sc.nextDouble();
         }
         rainInp[a] = inp;
         a+=1;
      }
      Rainfall yearone = new Rainfall(rainInp);
      System.out.println("Total Rainfall: "+yearone.getTotalRainfall());
      System.out.println("Average Rainfall: "+yearone.getAverageRainfall());
      System.out.println("Month With Lowest Rainfall: "+yearone.getLowestMonth());
      System.out.println("Month With Highest Rainfall:"+yearone.getHighestMonth());
      
   }
}