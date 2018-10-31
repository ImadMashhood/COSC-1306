public class LicenseExam
{
   private String[] OriginalAnswers = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"}; 
   private String[] AnswersGiven; 
   int[] missed = new int[OriginalAnswers.length]; 

   public boolean passed()
   {
      if (totalCorrect() >= 15)
         return true; 
      else
         return false; 
   }

   public int totalCorrect()
   {
      int correctCount = 0; 
      for (int i = 0; i < OriginalAnswers.length; i++)
      {
         if (AnswersGiven[i].equalsIgnoreCase(OriginalAnswers[i]))
         {
            correctCount++; 
         }
      }
      return correctCount; 
   }
   
   public int totalIncorrect()
   {
      int incorrectCount = 0;
      for (int i = 0; i < OriginalAnswers.length; i++)
      {
         if (!AnswersGiven[i].equalsIgnoreCase(OriginalAnswers[i]))
         {
            missed[incorrectCount] = i; 
            incorrectCount++;           
         }
      }
      return incorrectCount; 
   }
    
   public int[] questionsMissed()
   {
      return missed; 
   }
   
   //Constructor
   public LicenseExam (String[] Answers)
   {
      AnswersGiven = new String[Answers.length]; 
      for (int i = 0; i < Answers.length; i++)
      {
         AnswersGiven[i] = Answers[i]; 
      }
   }

}
