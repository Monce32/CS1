import java.util.*;

public class Student {

    private String name;
    private int grade;
	
    public Student() {
		
    }
	
    public Student(String name, int grade) {
        this.name = name;
	this.grade = grade;
    }
	
    public String getName() {
        return name;
    }
	
    public int getGrade() {
        return grade;
    }
	
    public void setName(String x) {
        name = x;
    }
	
    public void setGrade(int y) {
	grade = y;
    }
	
    @Override
	
    public String toString() {
        return "Name " + name + 
	       " Grade " + grade;
    }
}
