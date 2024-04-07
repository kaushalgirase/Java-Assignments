package Assignment;
/*Java program for rotation of elements of array- left and right. An array is
said to be right rotated if all the selected elements were moved towards
right by one position.*/
public class ArrayRightRotation {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5}; 
        int D = 2; 

        
        for (int i = 0; i < D; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

    
        System.out.print("Right rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}

}
