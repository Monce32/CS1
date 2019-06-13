import java.util.Scanner;

public class WeekDayMenu {
	public Scanner scnr = new Scanner(System.in);
	
	public static void main(String [] args) {
		WeekDayMenu obj = new WeekDayMenu();
		obj.displayMenu();
	}
	
	public void displayMenu() {
		System.out.println("       Menu");
		System.out.print("Select a day that you wish.");
		String day = scnr.next();
		System.out.println("You selected " + compareText(day));
	}
	
	public String compareText(String dayname) {
		String message = "";
		if(dayname.equalsIgnoreCase("monday")) {
			message = "Monday";
		}
		
		else if(dayname.equalsIgnoreCase("tuesday")) {
			message = "Tuesday";
		}
		
		else if(dayname.equalsIgnoreCase("wednesday")){
			message = "Wednesday";
		}
		
		else {
			message = "Invalid";
		}
		
		return message;
	}

}
