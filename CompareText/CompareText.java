/* Accept user input as Rectangle or Square
 * if user enters rectangle, display area of rectangle
 * if user enters square, display area of square
 * otherwise, error.
*/

import java.util.Scanner;

public class CompareText {
    public static void main(String [] args) {
	Scanner scnr = new Scanner(System.in);
	CompareText obj = new CompareText();
	obj.acceptInput(scnr);
    }
	
    public void acceptInput(Scanner scnr) {
	String polygonType = "";
	double side, length, width;
		
	System.out.println("Enter a polygon");
	polygonType = scnr.next();
		
	if(polygonType.equalsIgnoreCase("square")) {
	    System.out.println("You selected square");
	    System.out.println("Enter the side length");
	    side = scnr.nextDouble();
	    System.out.println("\nThe area is: " + Square(side));
	}
		
	else if(polygonType.equalsIgnoreCase("rectangle")) {
	    System.out.println("You selected rectangle");
	    System.out.println("Enter the length");
	    length = scnr.nextDouble();
	    System.out.println("Enter the width");
	    width = scnr.nextDouble();
	    System.out.println("\nThe area is: " + Rectangle(width, length));
	}
		
	else {
	    System.out.println("Invalid shape");
	}
    }
	
    public double Rectangle(double width, double length) {
		
        return width * length;
    }
	
    public double Square(double side) {
		
	return side * side;
    }
}
