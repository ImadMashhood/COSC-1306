//Imad Mashhood 4/12/18
import java.util.Scanner;
public class CircleClass
{
   public static void main (String[]args)
   {
      //Get Radius
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Radius of Circle");
      double radiusInp = sc.nextDouble();
      
      //Cant Be Negative
      while(radiusInp <=0)
      {
         System.out.println("Radius has to be Positive, Please Try Again");
         System.out.println("Enter Radius of Circle");
         radiusInp = sc.nextDouble();
      }
      
      //Calling Class
      Circle circleone = new Circle(radiusInp);
      
      //Print
      System.out.println("Radius of Circle:             "+circleone.getRadius());
      System.out.println("Area of Circle:               "+circleone.getArea());
      System.out.println("Diameter of Circle:           "+circleone.getDiameter());
      System.out.println("Circumference of Circle:      "+circleone.getCircumfrence());
   }
}
      