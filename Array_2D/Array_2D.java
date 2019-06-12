public class Array_2D {
	
    public static void main(String [] args) {
        int count = 0;
	int [][] nums = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
	int row;
	int col;
		
	for(int top = 0; top < nums.length; top++) {
	    for(row = top; row >= 0; row--) {
	        col = top - row;
		nums[row][col] = count;
		count++;
       	    }
	}    
		
	for(row = 0; row < nums.length; row++) {
    	    for(col = 0; col < nums[row].length; col++) {
	        System.out.print(nums[row][col] + " ");
	    }
 	    System.out.println();
	}
    }
}
