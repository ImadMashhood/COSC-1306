//Imad Mashhood 4/5/18
import java.util.Scanner;
public class AreaRectangle
{
   public static void main(String[] args)
   {
      double length,
             width,  
             area;      
      Scanner sc = new Scanner(System.in);

      // Get the rectangle's length from the user.
      length = getLength();
      
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(area);
   }
   public static double getLength()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Length of Rectangle: ");
      return sc.nextDouble();
   }
   public static double getWidth()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Width of Rectangle: ");
      return sc.nextDouble();
   }
   public static double getArea(double width, double length)
   {
      return (width*length);
   }
   public static void displayData(double area)
   {
      System.out.println("The Area of the Rectangle is "+area);
   }
}

