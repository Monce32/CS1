import java.util.*;
import java.io.*;
public class TextFile {

	public static void main(String [] args)throws IOException {
		Scanner inFile = new Scanner(new File("HW.txt"));
		TextFile obj = new TextFile();
		obj.readTextFile(inFile);
		
		inFile.close();
		
	}
	
	public void readTextFile(Scanner inputFile)throws IOException{
		String line = "";
		double Total = 0;
		String fileNum = "";
		int count = 0;
		while(inputFile.hasNextLine()) {
			
			line = inputFile.nextLine();
			StringTokenizer inputTokens = new StringTokenizer(line, " ");
			
			while(inputTokens.hasMoreTokens() && count < 5) {
				
					String x = inputTokens.nextToken();
					System.out.println("Number = " + x);
					Total = Total + Double.parseDouble(x);
					count ++;
			}
		}
		
		System.out.println("Sum = " + Total);
		
	}
}
