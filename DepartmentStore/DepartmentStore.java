import java.util.Scanner;

public class DepartmentStore {
    long   itemNumber;
    char   category;
    String itemName;
    double unitPrice;
		
    //parameterized constructor
    public DepartmentStore(long itemNumber, char category,
			    String itemName, double unitPrice) {
			
        this.itemNumber = itemNumber;
	this.category   = category;
	this.itemName   = itemName;
	this.unitPrice  = unitPrice;
		
    }
	
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
		
	System.out.println("Enter item number: " );
	long itemNumber = scnr.nextLong();
		
	System.out.println("Enter category: ");
	char category = scnr.next().charAt(0);
	scnr.nextLine();
		
	System.out.println("Enter item name: " );
	String itemName = scnr.nextLine();
		
	System.out.println("Enter unit price: " );
	double unitPrice = scnr.nextDouble();
		
	DepartmentStore dpt1 = new DepartmentStore(itemNumber, category, itemName, unitPrice);
	System.out.println("Item Number: " + dpt1.itemNumber);
	System.out.println("Category: "    + dpt1.category);
	System.out.println("Item name: "   + dpt1.itemName);
	System.out.println("Unit Price:"   + dpt1.unitPrice);
		
	DepartmentStore dpt2 = new DepartmentStore(8756, 'q', "hry", 58.9);
	System.out.println("Item Number: " + dpt2.itemNumber);
	System.out.println("Category: "    + dpt2.category);
	System.out.println("Item name: "   + dpt2.itemName);
	System.out.println("Unit Price:"   + dpt2.unitPrice);
		
    }
}
