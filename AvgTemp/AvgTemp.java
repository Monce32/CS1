/*
 * Accept daily temperature readings for five week days
 * and display the Max temperature which is greater than
 * the weekly average temperature.
 */

import java.util.Scanner;

public class AvgTemp {

    public static void main(String [] args) {
	Scanner scnr = new Scanner(System.in);
	AvgTemp obj = new AvgTemp();
	obj.acceptReadings(scnr);
    }
	
    public void acceptReadings(Scanner x) {
	double totalTemp = 0;
	double temp, avg;
	double maxTemp = 0;
		
	for(int dayNum = 1; dayNum <= 5; dayNum++) {
	    System.out.println("Enter temperature " + dayNum);
	    temp = x.nextDouble();
	    totalTemp = totalTemp + temp;
	    avg = totalTemp / dayNum;
	    System.out.println("Average temperature: " + avg);
			
	    if(temp > avg) {
		maxTemp = temp;
	    }
	}
		
	System.out.println("Weekly max temperature is: " + maxTemp);
    }
}
