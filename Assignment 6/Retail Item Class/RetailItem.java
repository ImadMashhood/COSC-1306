public class RetailItem
{
   //Variables
   private String description;
   private double price;
   private int UnitsOnHand;
   
   //Accessors
   public String getDescription()
   {
      return description;
   }
   public double getPrice()
   {
      return price;
   }
   public int getUnitsOnHand()
   {
      return UnitsOnHand;
   }
   
   //Constructor
   public RetailItem (double priceInp, String descriptionInp, int UnitsOnHandInp)
   {
      price = priceInp;
      description = descriptionInp;
      UnitsOnHand = UnitsOnHandInp; 
   }
}