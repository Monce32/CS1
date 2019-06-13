import java.util.*;
import java.io.*;

public class Student_Grades {

	public static void main(String [] args) throws IOException {
		Scanner inFile = new Scanner(new File("input.txt"));
		Student_Grades obj = new Student_Grades();
		PrintWriter outFile = new PrintWriter(new File("out.txt"));
		obj.readTextFile(inFile, outFile);
			
		inFile.close();
		outFile.close();
	}
	
	public void readTextFile(Scanner inputFile, PrintWriter outputFile)throws IOException{
		String line = " ";
		
		double avg = 0;
		String studentName = " ";
		 
		while(inputFile.hasNextLine()) {
			double total = 0;
			line = inputFile.nextLine(); //Anny 45 78 90
			StringTokenizer inputTokens = new StringTokenizer (line," ");
				studentName = inputTokens.nextToken();
				while(inputTokens.hasMoreTokens()) {
					total = total + Double.parseDouble(inputTokens.nextToken());
				}
				avg = total / 3;
				outputFile.println("Student Name: " + studentName);
				outputFile.println("Student class average: " + avg);
		}
		
		outputFile.println("Student Name");
		outputFile.close();
	}
}
