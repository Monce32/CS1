/*
 * Accept 5 subjects scores and display the max and 
 * the min out of the scores
 */

import java.util.Scanner;

public class AvgScores {

	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		AvgScores obj = new AvgScores();
		obj.acceptScores(scnr);
	}
	
	public void acceptScores(Scanner x) {
		double curScores;
		double maxScore = 0;
		double minScore = 100;
		
		System.out.println("Enter five scores.");
		
		for(int numScores = 1; numScores <= 5; numScores++) {
			curScores = x.nextDouble();
			System.out.println("Your score is: " + curScores);
		
			if(curScores > maxScore) {
				maxScore = curScores;
			}
			
			else if(curScores < minScore) {
				minScore = curScores;
			}
			
		}
		
		System.out.println("Max score is " + maxScore);
		System.out.println("Min score is " + minScore);
	}
}
