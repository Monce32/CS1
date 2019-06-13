import java.util.Scanner;

public class StudentGrades {
	
    Scanner scnr = new Scanner(System.in);
	
    public static void main(String [] args) {
		
    int [] studentGrades = new int [5];
    StudentGrades obj = new StudentGrades();
    obj.inputGrades(studentGrades);
    }
	
    public void inputGrades(int [] list) {
		
	for(int i = 0; i < 5; i++) {
	    System.out.print("\nEnter grade. " + (i + 1));
	    list[i] =  scnr.nextInt();
	}
		
	for(int a = 0; a < list.length; a++) {
	    System.out.println(list[a]);
	}
		
	for(int b = 0; b < list.length; b++) {
	    if(list[b] >= 50) {
	    System.out.println("Pass");
	    }
		
	    else {
	    System.out.println("Fail");
	    }
        }
    }
}
