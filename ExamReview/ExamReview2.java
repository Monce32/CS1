import java.util.*;
import java.io.*;

public class ExamReview2 {

	public static void main(String [] args)throws IOException {
		
		ExamReview2 obj = new ExamReview2();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter file name: " );
		String inputTextFile = input.next();
		ArrayList <Integer> fileList = new ArrayList <Integer>();
		System.out.println("Number of elements = " + obj.readArrayList(inputTextFile, fileList));
		input.close();
	}
	
	public int readArrayList(String fileName, ArrayList <Integer> fileList)throws IOException {
		
		Scanner inFile = new Scanner (new File(fileName));
		while(inFile.hasNextLine()) {
			
			String line = inFile.nextLine();
			StringTokenizer inputTokens = new StringTokenizer(line, ",");
			
			while(inputTokens.hasMoreTokens()) {
				fileList.add(Integer.parseInt(inputTokens.nextToken()));
				//intList[index] = inputTokens.nextInteger();
			
			}
		}
		inFile.close();
		return fileList.size();
	}
}
