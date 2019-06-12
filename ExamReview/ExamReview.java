import java.util.*;
import java.io.*;

public class ExamReview {

    public static void main(String [] args)throws IOException {
		
        ExamReview obj = new ExamReview();
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter file name: " );
	String inputTextFile = input.next();
	int [] inputArray = new int[20];
	int x = obj.readArray(inputTextFile, inputArray);
	System.out.println("Number of elements = " + x);
	input.close();
    }
	
    public int readArray(String fileName, int[] intList)throws IOException {
        int index = 0;	
	Scanner inFile = new Scanner (new File(fileName));
	    
	while(inFile.hasNextLine()) {
			
	    String line = inFile.nextLine();
	    StringTokenizer inputTokens = new StringTokenizer(line, ",");
			
	    while(inputTokens.hasMoreTokens()) {
	        intList[index] = Integer.parseInt(inputTokens.nextToken());
		//intList[index] = inputTokens.nextInteger();
		index++;
	    }
	}
	inFile.close();
	return index;
    }
}
