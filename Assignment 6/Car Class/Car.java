public class Car
{
   //variables
   private int yearModel;
   private String make;
   private int speed;

   //Accessors
   public int getYearModel()
   {
      return yearModel;
   }
   public String getMake()
   {
      return make;
   }
   public int getSpeed()
   {
      return speed;
   }
      
   //Modifiers
   public void accelerate()
   {
      speed += 5;
   }
   public void brake()
   {
      speed -= 5;
   }
 
   //Constructors   
   public Car(int yearModelInp, String makeInp)
   {
      yearModel = yearModelInp;
      make = makeInp;
      speed = 0;
   }

}