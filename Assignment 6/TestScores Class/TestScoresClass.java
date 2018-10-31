//Imad Mashhood 4/12/18
import java.util.Scanner;
public class TestScoresClass
{
   public static void main (String[]args)
   {
      Scanner sc = new Scanner(System.in);
      int TestInp;
      String scoreInp = " ";
      
      //Ask for Score
      System.out.println("Enter Score For Test One");
      int TestOne = sc.nextInt();
       System.out.println("Enter Score For Test Two");
      int TestTwo = sc.nextInt();
      System.out.println("Enter Score For Test Three");
      int TestThree = sc.nextInt();
      
      System.out.println("\n  Test     Grade");
      System.out.println("________________");
         
      //Call For Class
      
      //Test One
      TestInp = TestOne;
      TestScores testOne = new TestScores(TestInp, scoreInp);
      testOne.giveGrade();
      System.out.println("Test One     "+testOne.getScore());
      //Test Two
      TestInp = TestTwo;
      TestScores testTwo = new TestScores(TestInp, scoreInp);
      testTwo.giveGrade();
      System.out.println("Test Two     "+testTwo.getScore());
      //Test Three
      TestInp = TestThree;
      TestScores testThree = new TestScores(TestInp, scoreInp);
      testThree.giveGrade();
      System.out.println("Test Two     "+testThree.getScore()); 
   }
}