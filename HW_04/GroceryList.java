import java.util.Scanner;

public class GroceryList {

	final double BUN_COST = 0.5;
	final double COFFEE_COST = 1.2;
	final double CAKE_COST = 1.5;
	final double SANDWICH_COST = 2.1;
	final double DESSERT_COST = 4.00;
	
	public static void main(String [] args) {
		Scanner x = new Scanner(System.in);
		GroceryList obj = new GroceryList();
		obj.userInput(x);
	}
	
	public void userInput(Scanner scnr) {
		double bunTotal = 0.0;
		double coffeeTotal = 0.0;
		double cakeTotal = 0.0;
		double sandwichTotal = 0.0;
		double dessertTotal = 0.0;
		double TotalCost;
		int TotalCount = 0;	//Total number of items user inputs
		int count;			//Number of items user inputs
		String itemName = " ";
		
		
		do {
			System.out.print("Which item would you like in your basket?");
			itemName = scnr.next();
			System.out.println("How many items would you like to take?");
			count = scnr.nextInt();
			
			switch(itemName) {
			
			case "bun":
			case "Bun":
				 bunTotal = count * BUN_COST;
				 break;
				
			case "coffee":
			case "Coffee":
				 coffeeTotal = count * COFFEE_COST;	
				 break;
				
			case "cake":
			case "Cake":
				 cakeTotal = count * CAKE_COST;
				 break;
			
			case "sandwich":
			case "Sandwich":
				 sandwichTotal = count * SANDWICH_COST;
				 break;
			
			case "dessert":
			case "Dessert":
				dessertTotal = count * DESSERT_COST;
				break;
				
			default:
				System.out.print("Invalid item.");
				
			}
		
			System.out.println("Would you like to continue? If not press 'end'.");
			itemName = scnr.next();
			TotalCount = TotalCount + count;
		
		}while(! itemName.equalsIgnoreCase("end"));
		
		TotalCost = bunTotal + coffeeTotal + cakeTotal + sandwichTotal + dessertTotal;
		System.out.println("Total number of items: " + TotalCount);
		System.out.println("Your gran total will be " + TotalCost);
		
	}
	
	public void MaxNum(String y, double x) {
		double MaxNum = 0;
		double MinNum = 0;
		
		if(x > MaxNum) {
			System.out.println("The item with the most takings " + y);
		}
		
		
	}
	
}
