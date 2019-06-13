import java.util.Scanner;

public class WordCount {
	
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		WordCount obj = new WordCount();
		System.out.println("Enter a sentence");
		String sentence = scnr.nextLine();
		System.out.println("Number of words " + obj.countWords(sentence));
	}

	public int countWords(String sentence) {
		int numWords = 0;
		int counter = 0;
		char space = ' ';
		
		if (sentence.length() > 0) {
			numWords = 1;
			while(counter <= sentence.length() - 1) {
				if(sentence.charAt(counter) == space) {
				
				}
			counter ++;
			}
		
		}
		return numWords;
	}
	
}
