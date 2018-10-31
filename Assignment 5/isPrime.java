//Imad Mashhood 4/5/18
import java.util.Scanner;
public class isPrime
{
   public static void main(String[]args)
   {
      int x = 1;
      int n = 3;  
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an Integer to Find Out if its Prime: ");
      int number = sc.nextInt();
      isPrime(number, x, n);
   }
   public static void isPrime(int number, int x, int n)
   {
      while(x<1000000)
      {
         x+=1;
         number = number%x;
         //If the number divided by another number has a remainder of 0 and if they are not equal to each other
         if (number%x == 0 && x != number && x != 1)            
         {
            n = 0;
            break;
         }
         //If the number divided by a number does not have a remainder of 0
         else if(number%x != 0)
         {
            n = 1;
         }
      }
      if (n == 0)
         System.out.println("It is not Prime");
      else if (n == 1)
         System.out.println("It is Prime");
   }
}