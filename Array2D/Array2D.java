import java.util.Scanner;

public class Array2D {

    public static void main(String [] args) {
        int [] [] tempReadings = new int [3][3];
	Array2D obj = new Array2D();
	Scanner scnr = new Scanner(System.in);
	obj.inputTempReadings(tempReadings, scnr);
		
    }
	
    public void inputTempReadings(int[][] tempInputs, Scanner x) {
		
        for(int row = 0; row < tempInputs.length; row++) {
 	    for(int col = 0; col < tempInputs[row].length; col++) {
	         System.out.println("Enter the temp reading: ");
	  	 tempInputs[row][col] = x.nextInt();
	    }
        }
	printArray(tempInputs);
    }
	
    public void printArray(int [][] temps) {
        for(int row = 0; row < temps.length; row++) {
  	    for(int col = 0; col < temps[row].length; col++) {
	        System.out.print(temps[row][col] + " ");
	    }
	    System.out.println();
	}
    }
}
