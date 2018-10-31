public class TestScores
{
   private int test;
   private String score;
   
   //Accessor
   public int getTest()
   {
      return test;
   }
   public String getScore()
   {
      return score;
   }
   
   //Modifiers
   public void giveGrade()
   {
      if (test >= 90)
         score = "A";
      else if (test >= 80 && test < 90)
         score = "B";
      else if (test >= 70 && test < 80)
         score = "C";         
      else if (test >= 60 && test < 70)
         score = "D";
      else if (test < 60)
         score = "F";
   }
   
   //Constructor
   public TestScores(int TestInp, String scoreInp)
   {
      test = TestInp;
      score = scoreInp;
   }
}