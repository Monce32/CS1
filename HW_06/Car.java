public class Car {

	private int yearModel;
	private int speed;
	private String make;
	
	public Car() {
		
	}
	public Car(int yearModel, String make) {
		speed = 0;
		this.yearModel = yearModel;
		this.make = make;
	}
	
	public int getyearModel() {
		return yearModel;
	}

	public String getmake() {
		return make;
	}
	
	public int getspeed() {
		return speed;
	}
	
	public void setyearModel(int x) {
		yearModel = x;
	}
	
	public void setspeed(int y) {
		speed = y;
	}
	
	public void setmake(String z) {
		make = z;
	}
	
	public int accelerate(int speed) {
		return speed + 5;
	}
	
	public int brake(int speed) {
		return speed - 5;
	}
	
	@Override
	
	public String toString() {
		return "Car year model :" + yearModel +
				"car speed : " + speed +
				"car make: " + make;
	}
}
