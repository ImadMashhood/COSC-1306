//Imad Mashhood 4/19/18
import java.util.Scanner;
public class GradeBookClass
{
   public static void main( String []args)
   {
      double [] a = new double [4];
      double [] b = new double [4];
      double [] c = new double [4];
      double [] d = new double [4];
      double [] e = new double [4];
      String [] names = new String [5];
      int i = 0;

      Scanner sc = new Scanner(System.in);
      while(i<=4)
      {
         System.out.println("Enter Student's Name");
         names [i] = sc.nextLine();
         i+=1;
      }
      i=0;
      while(i<=3)
      {
         System.out.println("Enter Grade for Student One");
         a [i] = sc.nextDouble();
         while(a [i]>100||a [i]<0)
         {
            System.out.println("Invalid Entry Try Again");
            System.out.println("Enter Grade for Student One");
            a [i] = sc.nextDouble();
         }
         i+=1;
      }
      i=0;
      while(i<=3)
      {
         System.out.println("Enter Grade for Student Two");
         b [i] = sc.nextDouble();
         while(b [i]>100||b [i]<0)
         {
            System.out.println("Invalid Entry Try Again");
            System.out.println("Enter Grade for Student Two");
            b [i] = sc.nextDouble();
         }
         i+=1;
      }
      i=0;
      while(i<=3)
      {
         System.out.println("Enter Grade for Student Three");
         c [i] = sc.nextDouble();
         while(c [i]>100||c [i]<0)
         {
            System.out.println("Invalid Entry Try Again");
            System.out.println("Enter Grade for Student Three");
            c [i] = sc.nextDouble();
         }         
         i+=1;
      }
      i=0;
      while(i<=3)
      {
         System.out.println("Enter Grade for Student Four");
         d [i] = sc.nextDouble();
         while(d [i]>100||d [i]<0)
         {
            System.out.println("Invalid Entry Try Again");
            System.out.println("Enter Grade for Student Four");
            d [i] = sc.nextDouble();
         }         
         i+=1;
      }
      i=0;
      while(i<=3)
      {
         System.out.println("Enter Grade for Student Five");
         e [i] = sc.nextDouble();
         while(e [i]>100||e [i]<0)
         {
            System.out.println("Invalid Entry Try Again");
            System.out.println("Enter Grade for Student Five");
            e [i] = sc.nextDouble();
         }
         i+=1;
      }
      System.out.println("     Grade Book     ");
      System.out.println("____________________");
      
      GradeBook gb = new GradeBook(names,a,b,c,d,e);
      
      gb.findAverage();
      
      System.out.print(gb.getName()+"  "+gb.getAverage()+"     "+gb.getLetter()+"\n");
      gb.nextName();
      System.out.print(gb.getName()+"  "+gb.getAverage()+"     "+gb.getLetter()+"\n");
      gb.nextName();
      System.out.print(gb.getName()+"  "+gb.getAverage()+"     "+gb.getLetter()+"\n");
      gb.nextName();
      System.out.print(gb.getName()+"  "+gb.getAverage()+"     "+gb.getLetter()+"\n");
      gb.nextName();
      System.out.print(gb.getName()+"  "+gb.getAverage()+"     "+gb.getLetter()+"\n");

      
      
      
      
      
   }
}