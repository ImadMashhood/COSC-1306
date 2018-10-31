//Imad Mashhood 4/5/18
import java.util.Scanner;
public class TempTable
{
   public static void main(String[]args)
   {
      double F = 0;
      double C = 0 ;
      System.out.println(" F            C");
      System.out.println("________________");
      while(F<=20)
      {
         celsius(C, F);
         F+=1;
      }
   }
   public static void celsius(double C, double F)
   {
         C=(F-32)*.55;
         System.out.println(F+"        "+C);
         F+=1;
   }
}