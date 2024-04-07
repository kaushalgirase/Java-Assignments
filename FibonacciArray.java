package Assignment;

public class FibonacciArray {

	public static void main(String[] args) {
		int N = 10; 
        int[] fibArray = new int[N];

        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i < N; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        System.out.print("Fibonacci series up to " + N + " terms: ");
        for (int term : fibArray) {
            System.out.print(term + " ");
        }

	}

}
