import java.util.Scanner;

public class CompareText_01 {
	
    public static void main(String [] args) {
	Scanner scnr = new Scanner(System.in);
	CompareText_01 obj = new CompareText_01();
	obj.acceptInput(scnr);
    }
		
    public void acceptInput(Scanner scnr) {
	String polygonType = "";
			
	System.out.println("Enter a polygon");
	polygonType = scnr.next();
			
	switch(polygonType) {
			
	case "Square":
	case "square":	
	    displaySquareDetails(scnr);
	    break;
				
	case "Rectangle":
	case "rectangle":	
	    displayRectangleDetails(scnr);
	    break;
				
	default:
	    System.out.println("Invalid shape");
	    break;
		
	}
    }
	
    public void displaySquareDetails(Scanner scnr) {
        double side;
	System.out.println("You selected square");
	System.out.println("Enter the side length");
	side = scnr.nextDouble();
        System.out.println("\nThe area is: " + Square(side));
			
    }
		
    public void displayRectangleDetails(Scanner scnr) {
	double length, width;
	System.out.println("You selected rectangle");
	System.out.println("Enter the length");
	length = scnr.nextDouble();
	System.out.println("Enter the width");
	width = scnr.nextDouble();
	System.out.println("\nThe area is: " + Rectangle(width, length));
    }
		
    public double Rectangle(double width, double length) {
			
        return width * length;
    }
		
    public double Square(double side) {
			
        return side * side;
    }
}
