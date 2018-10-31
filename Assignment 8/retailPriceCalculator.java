//Imad Mashhood 4/23/18
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class retailPriceCalculator extends JFrame
{
   private JPanel panel;
   private JLabel messageLabelA;
   private JLabel messageLabelB;
   private JTextField wholesaleTextField;
   private JTextField markupPercentageTextField;
   private JButton calcButton;
   private final int WINDOW_WIDTH = 600;
   private final int WINDOW_HEIGHT = 100;
   
   public retailPriceCalculator()
   {
      setTitle("Retail Price Calculator");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buildPanel();
      add(panel);
      setVisible(true);
   }
   
   private void buildPanel()
   {
      messageLabelA = new JLabel("Enter wholesale cost then");
      wholesaleTextField = new JTextField(10);
      messageLabelB = new JLabel("Enter markup percentage:");
      markupPercentageTextField = new JTextField(10);
      calcButton = new JButton("Calculate");
      calcButton.addActionListener(new calcButtonListener());
      panel = new JPanel();
      panel.add(messageLabelA);
      panel.add(messageLabelB);
      panel.add(wholesaleTextField);
      panel.add(markupPercentageTextField);
      panel.add(calcButton);
   }
   
   private class calcButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String wholesaleInput;
         String markupInput;
         double wholePrice;
         double markUp;
         double retailPrice;
         
         wholesaleInput = wholesaleTextField.getText();
         wholePrice = Double.parseDouble(wholesaleInput);
         markupInput = markupPercentageTextField.getText();
         markUp = Double.parseDouble(markupInput);
         retailPrice = ((wholePrice * markUp) * .01) + wholePrice;
         
         JOptionPane.showMessageDialog(null, "Retail Price: $" + retailPrice);
      }
   }
   
   public static void main(String[] args)
   {
      new retailPriceCalculator();
   }
}