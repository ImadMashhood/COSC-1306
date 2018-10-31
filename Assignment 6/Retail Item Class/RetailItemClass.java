//Imad Mashhood 4/12/18
import java.util.Scanner;
public class RetailItemClass
{
   public static void main (String[]args)
   {
   
      Scanner sc = new Scanner(System.in);
   
      //Item 1
      System.out.println("Enter Item One's Description: ");
      String des1 = sc.next();
      System.out.println("Enter Item One's Price: ");
      double price1 = sc.nextDouble();
      System.out.println("Enter Amount of Item One on Hand: ");
      int Units1 = sc.nextInt();
      //Item 2 
      System.out.println("Enter Item Two's Description: ");
      String des2 = sc.next();
      System.out.println("Enter Item Two's Price: ");
      double price2 = sc.nextDouble();
      System.out.println("Enter Amount of Item Two on Hand: ");
      int Units2 = sc.nextInt();
      //Item 3
      System.out.println("Enter Item Three's Description: ");
      String des3 = sc.next();
      System.out.println("Enter Item Three's Price: ");
      double price3 = sc.nextDouble();
      System.out.println("Enter Amount of Item Three on Hand: ");
      int Units3 = sc.nextInt();
      
      //CallClass
      RetailItem itemo = new RetailItem(price1, des1, Units1);
      RetailItem itemt = new RetailItem(price2, des2, Units2);
      RetailItem itemr = new RetailItem(price3, des3, Units3);
      
      //Printing
      System.out.println("                   Description             Units On Hand              Price  ");
      System.out.println("________________________________________________________________________________");
      System.out.println("   Item #1            "+itemo.getDescription()+"                     "+itemo.getUnitsOnHand()+"                   $"+itemo.getPrice());
      System.out.println("   Item #1            "+itemt.getDescription()+"                     "+itemt.getUnitsOnHand()+"                   $"+itemt.getPrice());
      System.out.println("   Item #1            "+itemr.getDescription()+"                     "+itemr.getUnitsOnHand()+"                   $"+itemr.getPrice());
   
   }
}