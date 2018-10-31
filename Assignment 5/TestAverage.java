//Imad Mashhood 4/5/18
import java.util.Scanner;
public class TestAverage
{
   public static void main(String[]args)
   {
      Scanner sc = new Scanner(System.in);
      //Exam Grades
      System.out.println("Enter Exam One's Grade: ");
      double ExamOne = sc.nextDouble();
      System.out.println("Enter Exam Two's Grade: ");
      double ExamTwo = sc.nextDouble();
      System.out.println("Enter Exam Three's Grade: ");
      double ExamThree = sc.nextDouble();
      System.out.println("Enter Exam Four's Grade: ");
      double ExamFour = sc.nextDouble();
      System.out.println("Enter Exam Five's Grade: ");
      double ExamFive = sc.nextDouble();
      
      System.out.println(" Exam            Grade");
      System.out.println("_______________________");
            
      //Call For Grade
      double a;
      System.out.print(" Exam One");
      a = ExamOne;
      determineGrade(a);
      System.out.print(" Exam Two");
      a = ExamTwo;
      determineGrade(a);
      System.out.print(" Exam Three");
      a = ExamThree;
      determineGrade(a);
      System.out.print(" Exam Four");
      a = ExamFour;
      determineGrade(a);
      System.out.print(" Exam Five");
      a = ExamFive;
      determineGrade(a);
      
      double Average = 0;
      Average = calcAverage(ExamOne, ExamTwo, ExamThree, ExamFour, ExamFive, Average);
      System.out.println(" Average              "+Average);
   }
   
   public static void determineGrade(double a)
   {
      if(a>=90)
         System.out.println("              A");
      else if(a>=80 && a<90)
         System.out.println("              B");
      else if(a>=70 && a<80)
         System.out.println("            C");
      else if(a>=60 && a<70)
         System.out.println("             D");
      else
         System.out.println("             F");
   }
   
   public static double calcAverage(double ExamOne, double ExamTwo, double ExamThree, double ExamFour, double ExamFive, double Average)
   {
      Average = (ExamOne+ExamTwo+ExamThree+ExamFour+ExamFive)/5;
      return Average;
   }
}