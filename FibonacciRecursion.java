package Assignment;

public class FibonacciRecursion {

	public static void main(String[] args) {
		 int N = 10; // Change N to the desired term count

	        System.out.print("Fibonacci series up to " + N + " terms: ");
	        for (int i = 0; i < N; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }

	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
