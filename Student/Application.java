import java.util.*;

public class Application {

    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
	ArrayList <Student> studentList = new ArrayList <Student> ();
	Application obj = new Application();
		
	obj.fillStudentArray(studentList, scnr);
    }
	
    public void fillStudentArray(ArrayList <Student> studentList, Scanner x) {
        int stGrade;
	String stName = "";
		
	for(int i = 0; i < 5; i++) {
	    System.out.println("Enter the name of the student");
	    stName = x.nextLine();
	    System.out.println("Enter the grade of the student");
	    stGrade = x.nextInt();
	    x.next();
			
	    studentList.add(new Student(stName, stGrade));
	}
		
	for(int a = 0; a < studentList.size(); a++) {
	    System.out.println(studentList.get(a));
	}
    }
}
