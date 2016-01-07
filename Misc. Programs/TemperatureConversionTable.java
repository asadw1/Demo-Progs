/*
 * Asad Waheed
 * COSC1337-S01
 * LAB 3
 * 2/20/14
 */

import javax.swing.JOptionPane;
        
public class TemperatureConversionTable 
{

    public static void main(String[] args) 
    {
        //initialize an empty String
        String columnWidth = "                           ";
        String header = "Fahrenheit                    Celsius\n";
        String underline = "____________________";
        String table = header + underline;
        double fahrenheitValue;
        
        
        //prompt and get starting temp in F
        String userTempInput = JOptionPane.showInputDialog("Enter starting Temperature in Fahrenheit: ");
        double userTemp = Double.parseDouble(userTempInput);
        
        //prompt and get incrementation value
        String incrementerInput = JOptionPane.showInputDialog("Enter your incrementation value");
        double incrementer = Double.parseDouble(incrementerInput);
        
        //prompt and get ending temp
        String finalTempInput = JOptionPane.showInputDialog("Enter ending Temperature in Fahrenheit: ");
        double finalTemp = Double.parseDouble(finalTempInput);
        
         JOptionPane.showMessageDialog(null, table);
        //begin for loop
        for(fahrenheitValue = userTemp;fahrenheitValue <= finalTemp;fahrenheitValue += incrementer)
        {
            //conversion formula
            double convertedValue = (fahrenheitValue-32) * 5/9 ; 
            
            //Add output values into a string and concatenate
            String output = table + "\n" + fahrenheitValue + columnWidth + convertedValue;  
            
            JOptionPane.showMessageDialog(null, output + "\n");
        }    
          
        //How to get String output from for loop to a showMessageDialog box OUTSIDE the for loop.
        //end
        
        
    }
}
