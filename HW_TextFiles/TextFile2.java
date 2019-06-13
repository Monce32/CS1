import java.util.*;
	import java.io.*;
	public class TextFile2 {

		public static void main(String [] args)throws IOException {
			Scanner inFile = new Scanner(new File("HW.txt"));
			TextFile2 obj = new TextFile2();
			obj.readTextFile(inFile);
			
			inFile.close();
			
		}
		
		public void readTextFile(Scanner inputFile)throws IOException{
			String line = "";
			double Total = 0;
			
			while(inputFile.hasNextLine()) {
				
				line = inputFile.nextLine();
				StringTokenizer inputTokens = new StringTokenizer(line, " ");
				
				while(inputTokens.hasMoreTokens()) {
					String x = inputTokens.nextToken();
					
					Total = Total + Double.parseDouble(x);
					
					System.out.println("Number = " + x);
					
				}
			}
			
			System.out.println("Sum = " + Total);
			
		}
	}

