import java.util.Scanner;

public class Question_05 {

	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		Question_05 obj = new Question_05();
		obj.acceptInput(scnr);
	}
	
	public void acceptInput(Scanner x) {
		
		char input;
		
		System.out.println("We are selling three different grades of "
							+ "\nfood for pets, A, B and C grade");
		System.out.println("Choose a grade to find out how much it will cost");
		input = x.next().charAt(0);
		Pricing(input);
	}
	
	public void Pricing(char y) {
		switch(y) {
		
		case 'A':
		case 'a':
			System.out.println("The price is $0.30 per pound");
			break;
			
		case 'B':
		case 'b':
			System.out.println("The price is $0.20 per pound");
			break;
			
		case 'C':
		case 'c':
			System.out.println("The price is $0.15 per pound");
			break;
			
		default:
			System.out.println("Invalid");
		}
		
	}
}
