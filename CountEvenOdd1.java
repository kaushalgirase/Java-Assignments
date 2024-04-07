package Assignment;

import java.util.Scanner;

public class CountEvenOdd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of elements in the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Please enter " + size + " elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nTotal number of even numbers in the array: " + evenCount);
        System.out.println("Total number of odd numbers in the array: " + oddCount);
    }
}
