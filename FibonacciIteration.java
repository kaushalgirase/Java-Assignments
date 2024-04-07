package Assignment;

public class FibonacciIteration {
	public static void main(String[] args) {
        int N = 10;
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci series up to " + N + " terms: ");
        for (int i = 0; i < N; i++) {
            System.out.print(num1 + " ");
            int nextTerm = num1 + num2;
            num1 = num2;
            num2 = nextTerm;
        }
    }
}
	


