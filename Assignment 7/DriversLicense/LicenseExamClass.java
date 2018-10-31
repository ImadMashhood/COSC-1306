//Imad Mashhood 4/19/18
import java.util.Scanner; 

public class LicenseExamClass
{
   public static void main(String[] args)
   {
      int i = 0;
      System.out.println("    Driver's License Exam "); 
      Scanner input = new Scanner(System.in); 

      System.out.println(" 20 Multiple-Choice Questions "); 
      System.out.println("       Mark A, B, C, D   "); 

      String[] answers = new String[20]; 
      String answer; 

      while (i<20)
      {
         do
         {
            System.out.print((i+1) + ": "); 
            answer = input.nextLine(); 
         } while (!isValidAnswer(answer)); 

         answers[i] = answer; 
         i+=1;
      }

      LicenseExam exam = new LicenseExam(answers); 

      System.out.println("  RESULTS  "); 

      System.out.println("Total Correct: " + exam.totalCorrect()); 

      System.out.println("Total Incorrect: " + exam.totalIncorrect()); 

      String passed = exam.passed() ? "YES" : "NO"; 

      System.out.println("Passed: " + passed); 

      if (exam.totalIncorrect() > 0)
      {
          System.out.println("The incorrect answers are: "); 

          int missedIndex; 

          for (int a = 0; a < exam.totalIncorrect(); a++)
          {
            missedIndex = exam.questionsMissed()[a]+1; 
            System.out.print(" " + missedIndex); 
          }
      }
   }

   public static boolean isValidAnswer (String answer)
   {
      return "A".equalsIgnoreCase(answer) || 
         "B".equalsIgnoreCase(answer)
         || "C".equalsIgnoreCase(answer) || 
         "D".equalsIgnoreCase(answer); 
   }
} 