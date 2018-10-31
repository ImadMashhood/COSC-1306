//Imad Mashhood 4/26/18
//Pg 779, 780, 802
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MonthlySalesTax extends JFrame
{
   private JPanel panel;
   private JLabel messageLabel;
   private JTextField totalSales;
   private JButton calcButton;
   private final int WINDOW_WIDTH = 310;
   private final int WINDOW_HEIGHT = 100;
   private final double STATE_RATE = .02;
   private final double COUNTY_RATE = .04;
   
   public MonthlySalesTax()
   {
      setTitle("Monthly Sales Tax");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buildPanel();
      add(panel);
      setVisible(true);  
   }
   
   private void buildPanel()
   {
      messageLabel = new JLabel("Enter Total Sales:");
      totalSales = new JTextField (10);
      calcButton = new JButton("Calculate");
      calcButton.addActionListener(new calcButtonListener());
      panel = new JPanel();
      panel.add(messageLabel);
      panel.add(totalSales);
      panel.add(calcButton); 
   }
   
   private class calcButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String input;
         double totalSalesD, CTax, STax, TTax;
         input = totalSales.getText();
         
         totalSalesD = Double.parseDouble(input);
         CTax = totalSalesD*COUNTY_RATE;
         STax = totalSalesD*STATE_RATE;
         TTax = STax+CTax;
         
         JOptionPane.showMessageDialog(null, "County Tax: $" + CTax + "\nState Tax:  $" + STax + "\nTotal Tax:  $" + TTax );

      }
   }
   public static void main(String []args)
   {
      MonthlySalesTax mst = new MonthlySalesTax();
   } 
}