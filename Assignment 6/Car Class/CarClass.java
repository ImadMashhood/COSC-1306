//Imad Mashhood 4/12/18
import java.util.Scanner;
public class CarClass
{
   public static void main(String[]args)
   {
      int n =0;
      
      Scanner sc = new Scanner(System.in);
      //Model Year
      System.out.println("Enter Model Year of the Car: ");
      int year = sc.nextInt();
      
      //Make
      System.out.println("Enter the Make of the Car: ");
      String makeofcar = sc.nextLine();
      String m = sc.nextLine();

      
      Car myCar = new Car(year, m);
      
      while(1==1)
      {
          System.out.println("Would You Like to\n1. Accelerate\n2. Brake\n3. Quit");
          String Option = sc.nextLine();
          if(Option.contains("1")||Option.toLowerCase().contains("accel"))
          { 
             //Accelerate
             while (n<5)
             {
                myCar.accelerate();
                System.out.println("Your "+myCar.getYearModel()+" "+myCar.getMake()+" is Accelerating to " +myCar.getSpeed()+"mph");
                n+=1;   
             }
             n=0;
          }
          else if(Option.contains("2")||Option.toLowerCase().contains("bra"))
          {
            //Brake
             while (n<5)
             {
                myCar.brake();
                System.out.println("Your "+myCar.getYearModel()+" "+myCar.getMake()+" is Breaking to " +myCar.getSpeed()+"mph");
                n+=1;   
             }
             n=0;
          }
          else if(Option.contains("3")||Option.toLowerCase().contains("q"))
          break;
      }
   }
}  