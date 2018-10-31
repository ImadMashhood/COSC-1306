public class Circle
{
   //Variables
   private double radius;
   private final double Pi = 3.14159;
   
   //Mutators
   public void setRadius(double radiusInp)
   {
      radius = radiusInp;
   }
   
   //Accessors
   public double getRadius()
   {
      return radius;
   }
   public double getArea()
   {
      return Pi*radius*radius;
   }
   public double getCircumfrence()
   {
      return 2*Pi*radius;
   }
   public double getDiameter()
   {
      return radius*2;
   }
   
   
   //Constructors
   public Circle(double radiusInp)
   {
      radius = radiusInp;
   }
   public Circle()
   {
      radius = 0.0;
   }
   
}