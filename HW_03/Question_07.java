import java.util.Scanner;

public class Question_07 {

	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		Question_07 obj = new Question_07();
		obj.acceptInput(scnr);
	}
	
	public void acceptInput(Scanner x) {
		double usersBalance;
		double usersWithdrawal;
		
		System.out.println("This is the Automatic Teller Machine");
		System.out.println("In order to get a withdrawl from your"
						+ " /nsavings account please input the following");
		System.out.println("What is your current balance?");
		usersBalance = x.nextDouble();
		System.out.println("Balance: " + usersBalance);
		System.out.println("How much do you want to withdraw?");
		usersWithdrawal = x.nextDouble();
		
		outputWithdrawal(usersBalance, usersWithdrawal);
	}
	
	public void outputWithdrawal(double x, double y) {
		int dailyLimit = 300;
		
		if(y > x) {														// x = Balance
			System.out.println("Withdrawal has been denied.");			// y = Withdrawal
		}
		
		else if(y >= dailyLimit) {
			System.out.println("Withdrawal has been denied.");
		}
		else if(x < 100) {
			y = y * 0.2;
			x = x - y;
			System.out.println("Youre current balance is " + x);
		}
		
		else if(x == 100) {
			x = x - y;
			System.out.println("Youre current balance is " + x);
		}
		
		else {
			x = x - y;
			System.out.println("Youre current balance is " + x);
		}
		
	}
}
