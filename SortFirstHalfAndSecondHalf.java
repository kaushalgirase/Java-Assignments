package Assignment;

import java.util.Arrays;

public class SortFirstHalfAndSecondHalf {

	public static void main(String[] args) {
		 int[] arr = {1, 90, 34, 89, 7, 9}; 

	        Arrays.sort(arr);

	        int n = arr.length;
	        int middleIndex = n / 2;

	        for (int i = 0; i < middleIndex; i++) {
	            System.out.print(arr[i] + " ");
	        }

	      
	        for (int j = n - 1; j >= middleIndex; j--) {
	            System.out.print(arr[j] + " ");
	        }
	}

}
