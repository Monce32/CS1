/* 	This program lets the user input the temperature of
 * 	every day of this week.
 * 	Moncerrat Romero
 * 	3/13/2018
 * 	The program uses arrays in order to store a set 
 * 	of values.
 */

import java.util.Scanner;

public class Temperatures {

	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		Temperatures temp = new Temperatures();
		temp.InputTemp(scnr);
	}
	
	public void InputTemp(Scanner x) {
		
		double[] temperature = new double[7];
		
		System.out.println("Enter 7 temperatures: ");
		
		double sum = 0;
		for(int index = 0; index < 7; index++) {
			temperature[index] = x.nextDouble();
			sum = sum + temperature[index];
			System.out.println("Day " + (index + 1) + " temperature: " + temperature[index]);
		}
		
		double average = sum / 7;
		System.out.println("The average temperature is " + average);
		
		for(int index = 0; index < 7; index++) {
			if(temperature [index] < average) {
				System.out.println(temperature[index] + " below average");
			}
			
			else if(temperature[index] > average) {
				System.out.println(temperature[index] + " above average");
			}
			
			else {
				System.out.println(temperature[index] + " the average");
			}
		}
		
		System.out.println("Have a nice week.");
	}
}	
