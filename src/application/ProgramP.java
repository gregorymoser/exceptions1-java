package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ProgramP {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Product p;
		p = new Product();
		
		System.out.println("Enter the product data: ");
		System.out.println("Name: ");
		p.name = sc.next();
		System.out.println("Price: ");
		p.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		p.quantity = sc.nextInt();
		
		
		
		System.out.println("Product data: " + p.getName() + ", $ "
				+ p.getPrice() + ", " + p.getQuantity() + " units, Total: $" + p.totalValueInStock());
		
		System.out.println("Enter the number of products to be added in stock: ");
		p.addProducts(sc.nextInt());
		
		System.out.println("Product data: " + p.getName() + ", $ "
				+ p.getPrice() + ", " + p.getQuantity() + " units, Total: $" + p.totalValueInStock());
		
		System.out.println("Enter the number of products to be removed from stock: ");
		p.removeProducts(sc.nextInt());
		
		System.out.println("Product data: " + p.getName() + ", $ "
				+ p.getPrice() + ", " + p.getQuantity() + " units, Total: $" + p.totalValueInStock());
	}

}
