//Imad Mashhood 4/19/18
import java.util.Scanner;
public class PayrollClass
{
   public static void main( String []args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter EployeeID");
      System.out.println("5658845, 4520125, 7895122 \n8777541, 8451277, 1302850 \n7580489");
      int IDInp = sc.nextInt();
      
      Payroll IDOne = new Payroll(IDInp);
      IDOne.IDChecker();
      System.out.println("ID: "+IDOne.getID()+" Worked "+IDOne.getHours()+" Hours and Makes An Hourly Pay of "+IDOne.getPayrate()+" For a Total Wage of $"+IDOne.getGrossPay());
   }
}