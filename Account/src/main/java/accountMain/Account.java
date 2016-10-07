package accountMain;

import java.util.Date;

import Exceptions.InsufficientFundsException;

public class Account {
	
	//Create necessary variables
	private int id;
	private double balance;
	private double annualInterestRate;
	Date dateCreated = new Date();
	
	//Account Constructors
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	public Account(int newId, double newBalance) {
		this.id = newId;
		this.balance = newBalance;
	}
	public Account(int newId, double newBalance, double newAnnualInterestRate) {
		this.id = newId;
		this.balance = newBalance;
		this.annualInterestRate = newAnnualInterestRate;
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	//A method that deposits a specified amount to the account
	public double deposit(double amount){
		balance += amount;
		return balance;
	}
		
	//A method that withdraws a specified amount from the account
	public double withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance){
			balance -= amount;
		}
		else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
		return balance;
	}
	
	//A method that returns the monthly interest rate
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
}