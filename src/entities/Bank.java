package entities;

public class Bank {
	
	private String name;
	private int accountNumber;
	private double value;
	
	public Bank(String name, int accountNumber) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getValue() {
		return value;
	}

	public void deposit(double quantity) {
		value += quantity;
	}
	
	public void withdraw(double quantity) {
		value = (value - quantity) - 5;
	}
	
}
