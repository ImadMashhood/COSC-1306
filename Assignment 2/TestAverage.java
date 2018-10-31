//Imad Mashhood 2/8/18
import java.util.Scanner;
public class TestAverage
{
   public static void main(String[]args)
   {
      double ExamAverage;
      
      Scanner reader = new Scanner(System.in);
     
      System.out.print("Enter Exam One's Grade: ");
      double ExamOne = reader.nextDouble();
     
      System.out.print("\nEnter Exam Two's Grade: ");
      double ExamTwo = reader.nextDouble();
      
      System.out.print("\nEnter Exam Three's Grade: ");
      double ExamThree = reader.nextDouble();
  
      ExamAverage = (ExamOne+ExamTwo+ExamThree)/3;
      
      System.out.println("\nThe Average of Your Exams: "+ExamAverage);
   }
}
      