import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
		
	acceptInput();
    }
	
    public static void acceptInput(){
	double width;
	double length;
		
	Scanner scnr = new Scanner(System.in);
		
	System.out.println("Enter width: ");
	width = scnr.nextInt();
		
	System.out.println("Enter length: ");
	length = scnr.nextInt();
		
	System.out.println("The area of the rectangle is: " + 
							calcArea(width, length));
	System.out.println("The perimeter of the rectangle is: " + 
							calcPerimeter(width, length));
    }
	
    public static double calcArea(double x, double y ){
		
	double areaOfRect = x * y;
		
	return areaOfRect;
    }
	
    public static double calcPerimeter(double x, double y) {
		
	double periOfRect = (x + x) + (y + y);
		
	return periOfRect;
    }
}
