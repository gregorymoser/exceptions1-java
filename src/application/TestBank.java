package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class TestBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();

		Bank b1 = new Bank(name, accountNumber);

		System.out.println("In there an initial deposit (y/n)? ");
		String answer = sc.next();

		if (answer.equalsIgnoreCase("y")) {
			System.out.println("Enter initial deposit value: ");
			double quantity = sc.nextDouble();
			b1.deposit(quantity);
		} else {
			System.out.println("");
		}
		
		System.out.println("Account data: ");
		System.out.println("Account: "+ b1.getAccountNumber()+
							", Holder: "+ b1.getName()+
							", Balance: "+ b1.getValue());
		
		System.out.println("Enter a deposit value: ");
		double quantity = sc.nextDouble();
		b1.deposit(quantity);
		
		System.out.println("Updated account data: ");
		System.out.println("Account: "+ b1.getAccountNumber()+
							", Holder: "+ b1.getName()+
							", Balance: "+ b1.getValue());
		
		System.out.println("Enter a withdraw value: ");
		quantity = sc.nextDouble();
		b1.withdraw(quantity);
		
		System.out.println("Updated account data: ");
		System.out.println("Account: "+ b1.getAccountNumber()+
							", Holder: "+ b1.getName()+
							", Balance: "+ b1.getValue());

	}

}
