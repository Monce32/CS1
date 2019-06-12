/*
 * Name: Moncerrat Romero
 * Purpose: Uses the basic fundamentals of a normal cashier
 * 	    by asking the user to input the item and calculates the cost
 * Date created: 02/05/2018
 * Class: CS 1050
*/

import java.util.Scanner;

class Cashier {
Scanner scnr = new Scanner(System.in);
	
    public static void main(String [] args) {
        //calls an empty constructor
	Cashier csh = new Cashier();
	csh.acceptInput();
	
    }

    public void acceptInput(    ) {
        String item;
	double price;
	int quantity;
		
	System.out.println("Enter the item name");
	item = scnr.nextLine();
	System.out.println("Enter the price of the item");
	price = scnr.nextDouble();
	System.out.println("Enter the quantity");
	quantity = scnr.nextInt();
		
	double tPrice = calcTotalPrice(quantity, price);
	System.out.println("Total price is: " + tPrice);
    }
	
    public double calcTotalPrice(int q, double price) {
		
	return q * price;
    }
}
