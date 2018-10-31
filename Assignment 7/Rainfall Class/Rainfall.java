public class Rainfall
{

   double [ ] monthRain;
   
   //Accessors
   //Total
   public double getTotalRainfall()
   {
      double totalRain = 0;
      
      int a = 0;
      while(a<monthRain.length)
      {
         totalRain = totalRain+monthRain [a];
         a+=1;
      }
      return totalRain;
   }
   //Average
   public double getAverageRainfall()
   {
      
      double totalRain = 0;
      
      int a = 0;
      while(a<monthRain.length)
      {
         totalRain = totalRain+monthRain [a];
         a+=1;
      }
      double averageRain = totalRain/monthRain.length;
      return averageRain;
   }
   //Lowest Month
   public double getLowestMonth()
   {
      int a = 0;
      double lastval = monthRain [a];
      double LowestMonth = a;
      while(a<monthRain.length)
      {
         if (lastval>monthRain [a])
         {
            lastval = monthRain [a];
            LowestMonth = a;
         }
         a+=1;
      }
      return LowestMonth+1;
   }
   //Highest Month
   public double getHighestMonth()
   {
      int a = 0;
      double lastval = monthRain [a];
      double HighestMonth = a;
      while(a<monthRain.length)
      {
         if (lastval<monthRain [a])
         {
            lastval = monthRain [a];
            HighestMonth = a;
         }
         a+=1;
      }
      return HighestMonth+1;
   }
   
   //Constructor
   public Rainfall(double [ ]rainInp)
   {
      monthRain = new double [ rainInp.length ];
      int a = 0;
      while(a<rainInp.length)
      {
         monthRain [a] = rainInp [a];
         a+=1;
      }
   }
}