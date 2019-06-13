import java.util.Scanner;

public class Question_08 {

	public static void main(String []  args) {
		Scanner scnr = new Scanner(System.in);
		Question_08 obj = new Question_08();
		obj.acceptInput(scnr);
		
	}
	
	public void acceptInput(Scanner x) {
		String Country = "";
		int Population, landArea;
		double avgPop = 0;
		double calcDensity; 
		double MaxDens = 0;
		double MinDens = 0;
		
		System.out.println("Im going to calculate the population "
							+ "/ndensity of three different countries");
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("Enter the name of country.");
			Country = x.next();
			System.out.println("Enter the population.");
			Population = x.nextInt();
			System.out.println("Enter the land area.");
			landArea = x.nextInt();
			System.out.println(Country + ":");
			System.out.println("Population: " + Population 
								+ "\nLand Area: " + landArea);
			calcDensity = Population / landArea;
			
		//	while(i <= 3) {
		//		avgPop = Population / i;
		//	}
			
			System.out.println("Population Density: " + calcDensity);
			
			if(calcDensity > MaxDens) {
				MaxDens = calcDensity;
				
			}
			
			else if(calcDensity < MinDens) {
				MinDens = calcDensity;
			}
		}
		
		System.out.println("Maximum density: " + MaxDens);
		System.out.println("Minimum density: " + MinDens);
		//System.out.println("Average Population: " + avgPop);
	}
}
