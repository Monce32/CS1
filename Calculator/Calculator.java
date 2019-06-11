/* 1. Instance methods (non static)
 * 2. Class initialization - create new objects
 * 3. Instance variables
 * 4. Constants - final static double TAX_AMT = 0.05;
 */ 
 
import java.util.Scanner;

class Calculator {
	
    int num1;
    int num2;
	
    public int add(int x, int y) {		//Constructor - is a method which doesn't have a return 
				 	        //data type - used to create new objects
        return x + y;
    }
	
    public static void main(String[]args) {
  
    	Scanner scnr = new Scanner(System.in);
	Calculator c1 = new Calculator();
		
	System.out.print("Enter number1: ");
	c1.num1 = scnr.nextInt();
		
	System.out.print("Enter number2: ");
	c1.num2 = scnr.nextInt();
		
	System.out.println("The answer is = " + c1.add(c1.num1, c1.num2));
		
    }
}
