import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalcCheck {

		public static void main(String [] args) {
		
			double amount, taxAmount, finalAmount;
			int tipAmount;
			double taxRate = 0.08;	//8%
			Scanner scnr = new Scanner(System.in);
			
			JOptionPane.showInputDialog(null, "Enter the amount of your check"
							    + " before taxes are applied." );
			amount = scnr.nextDouble();
			
			JOptionPane.showInputDialog(null, "Enter the amount of tip money you " 
								+ "would like to give.");
			tipAmount = scnr.nextInt();
			
			taxAmount = (taxRate * amount) + amount;
			finalAmount = taxAmount + tipAmount;
			
			JOptionPane.showMessageDialog(null, "Check amount: " + amount 
										 + "\nCheck amount after taxes: " + taxAmount
										 + "\nTip amount: " + tipAmount
										 + "\nThe final amount after taxes including " 
										 + "the tip amount is " + finalAmount);
			
		}
}
