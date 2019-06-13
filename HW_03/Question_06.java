 import java.util.Scanner;

public class Question_06 {

	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		Question_06 obj = new Question_06();
		obj.acceptInput(scnr);
	}
	
	public void acceptInput(Scanner x) {
		String answer;
		double inputNum;
		double totalNum = 0;
		double numSubjects = 0;
		
		do {
			System.out.println("Im going to calculate the average of five numbers");
			System.out.println("Please enter 5 numbers");	
			for(int i = 0; i <= 4; i++) {
				inputNum = x.nextDouble();
				totalNum = totalNum + inputNum;
				numSubjects++;
			}
			System.out.println("Would you like to add another value? Enter n/N ");
			answer = x.next();
			while(answer.charAt(0) != 'n' && answer.charAt(0) != 'N') {
				System.out.println("Enter the value");
				inputNum = x.nextDouble();
				totalNum = totalNum + inputNum;
				numSubjects = numSubjects + 1;
				System.out.println("Would  you like to continue? Enter n/N to exit");
				answer = x.next();
			}
			
		}
		while(answer.charAt(0) != 'n' && answer.charAt(0) != 'N');
		System.out.println("Total score: " + totalNum);
		System.out.println("The average is " + totalNum/numSubjects);
	}	
}
