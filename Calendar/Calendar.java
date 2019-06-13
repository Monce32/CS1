/* User is prompted for a month number and a month name will
 * be displayed based on the input type.
*/

import java.util.Scanner;

public class Calendar {

	public static void main(String [] args) {
		Calendar cld = new Calendar();
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a month number.");
		int month = scnr.nextInt();
		cld.displayMonthName(month);
			
	}
	
	/* @params: monthNumber
	 * @Dreturn: none
	 * @Description: Calculates the month name based on the
	 * 				 month odd number
	 */
	public void displayMonthName(int monthNumber) {
		if (monthNumber >= 1 && monthNumber <= 12) {
			// true branch
			if(monthNumber % 2 == 1) {
			
			if(monthNumber == 1) {
				System.out.println("January");
				}
			else if(monthNumber == 3) {
				System.out.println("March");
			}
			else if(monthNumber == 5) {
				System.out.println("May");
			}
			else if(monthNumber == 7) {
				System.out.println("July");
			}
			else if(monthNumber == 9) {
				System.out.println("September");
			}
			else {
				System.out.println("November");
			}	
		}
		else {
			System.out.println("Month is not an odd number");
			}
		}		
	}
}
