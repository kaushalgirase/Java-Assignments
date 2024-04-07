package Assignment;

public class AccountTest {

		public static void main(String[] args) {
	        SavingsAccount savingsAccount = new SavingsAccount("562565264", 1000, 2.5);
	        savingsAccount.deposit(500);
	        savingsAccount.calculateInterest();
	        savingsAccount.printAccountDetails();

	        HousingLoan housingLoan = new HousingLoan("HL456", 200000, 500000, "123 Main St");
	        housingLoan.applyLoan(300000);
	        housingLoan.printAccountDetails();
	        housingLoan.printPropertyDetails();
	    }

	}


