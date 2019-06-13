import java.util.Scanner;

public class Question_04 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Question_04 obj = new Question_04();
		obj.acceptSalary(sc);
	}
	
	public void acceptSalary(Scanner scnr) {
		int annualSalary;
		int Years;
		
		System.out.println("To qualify for a loan you must enter " + 
							"\nyour annual salary and the current number of years" + 
							" \nyou have been at your job.");
		System.out.println("What is your annual salary?");
		annualSalary = scnr.nextInt();
		System.out.println("Your annual salary is " + annualSalary);
		
		System.out.println("How many years have you been working at your job?");
		Years = scnr.nextInt();
		System.out.println("Number of years you have been working at current job " + Years);
		
		
		System.out.println("You " + calcLoanAmt(annualSalary, Years) + " for a loan");
	}
	
	public String calcLoanAmt(double sal, int numYears) {
		String message = "";
		if(sal >= 5000 || numYears >= 5) {
			message = "Qualify";
		}
		else{
			message = "Do not Qualify";
		}
		
		return message;
	}
}
