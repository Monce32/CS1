import java.util.*;

public class CommonElement {

	public static void main(String [] args) {
		int[] my_array1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] my_array2 = {25, 14, 56, 8, 7, 6, 77, 18, 29, 49};
		int[] commonArray = new int [my_array1.length];
		commonArray = findCommon(my_array1, my_array2);
		System.out.print(Arrays.toString(commonArray));
	}
	
	public static int [] findCommon(int [] array1, int [] array2) {
		int [] commonElements = new int [array1.length];
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++) {
				if(array1[i] == array2[j]) {
					commonElements [i] = array1[i];
				}
			}
		}
		return commonElements;
	}
}
