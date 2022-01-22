package entities;

public class Account {

	public int number;
	public String owner;
	public double balance;
	public double CCLimit;
	public double withdraws;
	public double deposits;
	public double newBalance;
	
	public Account() {
	}

	public Account(int number, String owner, double balance, double cCLimit, double withdraws, double deposits,
			double newBalance) {
		this.number = number;
		this.owner = owner;
		this.balance = balance;
		CCLimit = cCLimit;
		this.withdraws = withdraws;
		this.deposits = deposits;
		this.newBalance = newBalance;
	}
	
	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getCCLimit() {
		return CCLimit;
	}

	public void setCCLimit(double cCLimit) {
		CCLimit = cCLimit;
	}

	public double getWithdraws() {
		return withdraws;
	}

	public void setWithdraws(double withdraws) {
		this.withdraws = withdraws;
	}

	public double getNewBalance() {
		return newBalance;
	}

	public void setNewBalance(double newBalance ) {
		this.newBalance = newBalance;
	}

	public double accountWithdraws(double theAmount) {
		double newBalance = this.balance - theAmount;
		return newBalance;
	}

	public void deposits(double theAmount) {
		this.balance += theAmount;
	}

}
