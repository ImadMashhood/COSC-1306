public class Payroll
{
   private int [] EmployeeID = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
   private int hours [] = {23, 28, 23, 45, 38, 45, 49};
   private double payrate [] = {13.5, 25.74, 24.87, 24.12, 30.41, 53.21, 35.23};
   private double wages [] = {310.5, 720.72, 572.01, 1085.4, 1155.58, 2394.45, 1726.27};
   private int IDCheck;
   private int num;
   
   //Modifier
   public void IDChecker()
   {
      if (IDCheck == 5658845)
      {
         num = 0;
      }
      else if (IDCheck == 4520125)
      {
         num = 1;
      }
      else if (IDCheck == 7895122)
      {
         num = 2;
      }
      else if (IDCheck == 8777541)
      {
         num = 3;
      }
      else if (IDCheck == 8451277)
      {
         num = 4;
      }
      else if (IDCheck == 1302850)
      {
         num = 5;
      }
      else if (IDCheck == 7580489)
      {
         num = 6;
      }
   }
   
   //Accessor
   public int getID()
   {
      return EmployeeID[num];
   }
   public int getHours()
   {
      return hours[num];
   }
   public double getPayrate()
   {
      return payrate[num];
   }
   public double getGrossPay()
   {
      return wages[num];
   }
   
   public Payroll(int IDInp)
   {
      IDCheck = IDInp;
   }
}