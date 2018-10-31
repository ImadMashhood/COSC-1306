public class GradeBook
{
   private String [] Students = new String [5];
   private String [] letters = {"A","B","C","D","F"};
   private String [] LetterGrade = new String [5];
   private double [] StuOneGrades = new double [4];
   private double [] StuTwoGrades = new double [4];
   private double [] StuThreeGrades = new double [4];
   private double [] StuFourGrades = new double [4];
   private double [] StuFiveGrades = new double [4];
   private double [] Averages = new double [5];
   private int num = 0;
   
   //Modifiers
   public void nextName()
   {
      num = num+1;
   }
   public void findAverage()
   {
      int i = 0;
      double avone = 0;
      double avtwo = 0;
      double avthree = 0;
      double avfour = 0;
      double avfive = 0;
      
      //average for one
      while(i<=3)
      {
         avone = StuOneGrades [i] + avone;
         i+=1;
      }
      avone = avone/4;
      Averages [0] = avone;
      i = 0;
      //average for two
      while(i<=3)
      {
         avtwo = StuTwoGrades [i] + avtwo;
         i+=1;
      }
      avtwo = avtwo/4;
      Averages [1] = avtwo;
      i = 0;  
      //average for three
      while(i<=3)
      {
         avthree = StuThreeGrades [i] + avthree;
         i+=1;
      }
      avthree = avthree/4;
      Averages [2] = avthree;
      i = 0;  
      //average for four
      while(i<=3)
      {
         avfour = StuFourGrades [i] + avfour;
         i+=1;
      }
      avfour = avfour/4;
      Averages [3] = avfour;
      i = 0;  
      //average for five
      while(i<=3)
      {
         avfive = StuFiveGrades [i] + avfive;
         i+=1;
      }
      avfive = avfive/4;
      Averages [4] = avfive;
      i = 0;          
      
   }
   public void findLetter()
   {
      int i = 0;
      while(i<=4)
      {
         if(Averages [i]>=90)
            LetterGrade [i] = letters[0];
         else if(Averages [i]>=80 && Averages [i]<90)
            LetterGrade [i] = letters[1];
         else if(Averages [i]>=70 && Averages [i]<80)
            LetterGrade [i] = letters[2];
         else if(Averages [i]>=60 && Averages [i]<70)
            LetterGrade [i] = letters[3];
         else
            LetterGrade [i] = letters[4];
         i=+1;
      }
   }
   
   
   //Accessors
   public String getName()
   {
      return Students[num];
   }
   public double getAverage()
   {
      return Averages[num];
   }
   public String getLetter()
   {
      if(Averages [num]>=90)
         return letters[0];
      else if(Averages [num]>=80 && Averages [num]<90)
         return letters[1];
      else if(Averages [num]>=70 && Averages [num]<80)
         return letters[2];
      else if(Averages [num]>=60 && Averages [num]<70)
         return letters[3];
      else
         return letters[4];
   }

   //Constructor
   public GradeBook(String []names, double [] a, double [] b, double [] c, double [] d, double [] e)
   {
      
      for(int i=0; i<=4; i++)
      {
         Students[i] = names[i];
      }
      for(int i=0; i<=3; i++)
      {
      StuOneGrades[i] = a[i];
      }
      for(int i=0; i<=3; i++)
      {
      StuTwoGrades[i] = b[i];
      }
      for(int i=0; i<=3; i++)
      {
      StuThreeGrades[i] = c[i];
      }
      for(int i=0; i<=3; i++)
      {
      StuFourGrades[i]= d[i];
      }
      for(int i=0; i<=3; i++)
      {
      StuFiveGrades[i] = e[i];
      }
   }
   
}