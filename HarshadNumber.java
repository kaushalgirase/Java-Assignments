package Assignment;

public class HarshadNumber {

	public static void main(String[] args) {
		 int num = 156; 
	        int copyNum = num;
	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            sum += digit;
	            num /= 10;
	        }

	        if (copyNum % sum == 0) {
	            System.out.println(copyNum + " is a Harshad number.");
	        } else {
	            System.out.println(copyNum + " is not a Harshad number.");
	        }
	}

}
