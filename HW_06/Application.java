import java.util.*;

public class Application {

	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList <Car> carList = new ArrayList <Car> ();
		Application obj = new Application();
		
		obj.fillcarArray(carList, scnr);
		
		Car car1 = new Car(2018, "Toyota");
		for(int i = 0; i < 5; i++) {
			System.out.println("The current speed is " + car1.brake(car1.getspeed()));
		}
		System.out.println("The current speed is " + car1.accelerate(car1.getspeed()));
		
	}
	
	public void fillcarArray (ArrayList <Car> carList, Scanner x) {
		int carMakeYear;
		String carModel;
		for(int i = 0; i < 2; i++) {
			System.out.println("Enter the year of the vehicle?");
			carMakeYear = x.nextInt();
			x.nextLine();
			System.out.println("Enter the model of the vehicle? ");
			carModel = x.nextLine();
			
			carList.add(new Car(carMakeYear, carModel));
		}
		
		printCars(carList);
		
	}
	
	public void printCars(ArrayList <Car> carList) {
		
		for(int a = 0; a < carList.size(); a++) {
			System.out.print(carList.get(a));
		}
	}
	
}

