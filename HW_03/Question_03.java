import java.util.Scanner;

public class Question_03 {

	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		Question_03 obj = new Question_03();
		obj.Output(scnr);		
	}
	
	public void Output(Scanner x) {
		String answer;
		double Num;
		
		do {
			System.out.println("Im going to square any number that you input.");
			System.out.println("Enter a number");
			Num = x.nextDouble();
			Num = Num * Num;
			System.out.println("Number : " + Num);
			System.out.println("Do you want to continue? Enter n/N to stop.");
			System.out.println("Or enter y/Y to continue.");
			answer = x.next();
		}
		while(answer.charAt(0) != 'n' && answer.charAt(0) != 'N');
		
			System.out.println("Have a good day.");
	}
}
