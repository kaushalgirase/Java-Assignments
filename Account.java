package Assignment;

/*Create a class, named Account and include the required attributes and
behaviours in it. Inherit another class called “SavingsAccount” from it
and add new attributes and behaviours, as needed. Inherit another class
called “LoanAccount” from Account and add new attributes and
behaviours, as needed. Inherit another class called “HousingLoan” from
LoanAccount and add new attributes and behaviours, as needed. Create
objects of SavingsAccount and HousingLoan and perform the methods to
1. Open an account, 2. Deposit amount, 3. Withdraw amount, 4. Print
the account details. (Consider applying the Access Modifiers also)*/

public class Account {
	
	private String accountNumber;
    protected double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
    }
}

class LoanAccount extends Account {
    private double loanAmount;

    public LoanAccount(String accountNumber, double initialBalance, double loanAmount) {
        super(accountNumber, initialBalance);
        this.loanAmount = loanAmount;
    }

    public void applyLoan(double requestedAmount) {
        if (requestedAmount <= loanAmount) {
            balance += requestedAmount;
            System.out.println("Loan approved. New balance: " + balance);
        } else {
            System.out.println("Loan request exceeds available limit.");
        }
    }
}

class HousingLoan extends LoanAccount {
    private String propertyAddress;

    public HousingLoan(String accountNumber, double initialBalance, double loanAmount, String propertyAddress) {
        super(accountNumber, initialBalance, loanAmount);
        this.propertyAddress = propertyAddress;
    }

    public void printPropertyDetails() {
        System.out.println("Property Address: " + propertyAddress);
    }
}




