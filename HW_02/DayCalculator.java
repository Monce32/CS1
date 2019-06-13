import java.util.Scanner;

public class DayCalculator {

	public static void main(String [] args) {
		Scanner obj = new Scanner(System.in);
		DayCalculator dct = new DayCalculator();
		dct.displayMenu(obj);
	}
	
	public void displayMenu(Scanner scnr) {
	
		
		System.out.println("Menu");
		System.out.println("==============");
		System.out.println("Select a day, which you wish");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		
		int day = scnr.nextInt();
		
		
		if(day >= 1 && day <= 5) {
			System.out.println("You have selected ");
			displayDayName(day);
		}
		else {
			System.out.println("Invalid number");
		}
		
	}
	
	public void displayDayName(int input) {
		switch (input) {
		
		case 1: 
			System.out.println("Monday");
			break;
		
		case 2:
			System.out.println("Tuesday");
			break;
		
		case 3:
			System.out.println("Wednsday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
		}
	}
}
