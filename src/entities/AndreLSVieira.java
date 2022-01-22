package entities;

import java.util.Locale;

public class AndreLSVieira {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Account checkingAccount;
		checkingAccount = new Account();

		checkingAccount.owner = "Duke";
		System.out.println("Current account holder: " + checkingAccount.owner);
		checkingAccount.balance = 1000.0;
		System.out.printf("Current account balance: %.2f\n", checkingAccount.balance);
		checkingAccount.accountWithdraws(200);
		checkingAccount.getNewBalance();
		System.out.printf("Withdrawal from checking account: %.2f\n", checkingAccount.newBalance);
		checkingAccount.deposits(500);
		System.out.printf("Deposit to current account %.2f\n", checkingAccount.deposits);
		System.out.println("Saldo atual: " + checkingAccount.balance);

	}

}
