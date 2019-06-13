import java.util.Scanner;

public class Question_02 {

	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		Question_02 obj = new Question_02();
		obj.acceptInput(scnr);
	}
	
	public void acceptInput(Scanner x) {
		String answer;
		double firstNum;
		double secondNum;
		double total;
		
		do {
			System.out.println("I will compute the product of two numbers.");
			System.out.println("Enter a number");
			firstNum = x.nextDouble();
			System.out.println("Enter another number");
			secondNum = x.nextDouble();
			total = firstNum * secondNum;
			System.out.println("Total: " + total);
			System.out.println("Do you want to continue? Enter n/N to stop.");
			System.out.println("Or enter y/Y to continue.");
			answer = x.next();
		}
		while(answer.charAt(0) != 'n' && answer.charAt(0) != 'N');
		
		System.out.println("Have a good day.");
	}
}
