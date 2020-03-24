package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class TestCurrencyConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.printf("What is the dolar price? %.2f%n", CurrencyConverter.DOLAR);
		System.out.println("How many dollars will be bought? ");
		double v = sc.nextDouble();
		System.out.println("Amount to be áid in reais = " + CurrencyConverter.converter(v));
		
		sc.close();
	}

}
