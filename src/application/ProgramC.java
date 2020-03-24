package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;

public class ProgramC {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Carro c;
		c = new Carro();
			
		System.out.println("Qual a quilometragem?");
		c.kilometros = sc.nextDouble();
		
		System.out.println("Quantos litros?");
		c.litros = sc.nextDouble();
		
		System.out.printf("o consumo é: %.2f", c.consumo());
		
		sc.close();

	}

}
