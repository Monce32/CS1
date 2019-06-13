/*
` * Name:		Moncerrat Romero
 * Purpose:		This program calculates the amount of
 * 				a check after taxes and with tip.
 * Date:		2/13/2018
*/
import java.util.Scanner;

public class HW_01 {
	
	public static void main(String [] args) {
		HW_01 obj = new HW_01();
		
		obj.Input_Output();
	}

	public double taxAmount(double x, double z) {	 
		//Calculates the amount after taxes are applied
		
		return (z * x) + x;
	}
		
	public double finalAmount(double y, double x, double z) {
		//Calculates the amount after taxes and tip are applied
		
		return y + ((z * x) + x);
	}
	
	public void Input_Output(){
		double amount;
		int tipAmount;
		double TAX_RATE;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the tax rate in decimal format.");
		TAX_RATE = scnr.nextDouble();
		System.out.println("The tax rate is " + TAX_RATE);
		System.out.println("Enter the amount of check " 
						   + "before taxes are applied.");
		amount = scnr.nextDouble();
		System.out.println("Check amount: " + amount);
		System.out.println("Check amount after taxes: " + taxAmount(amount, TAX_RATE));
		
		System.out.println("Enter the amount of tip you " 
						   + "would like to give");
		tipAmount = scnr.nextInt();
		System.out.println("Tip amount: " + tipAmount);
		
		System.out.println("The final amount after taxes including " 
						   + "the tip amount is " + finalAmount(tipAmount, amount, TAX_RATE));
		

	}
}
