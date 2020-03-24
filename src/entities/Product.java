package entities;

public class Product {
	public String name; 
	public double price; 
	public int quantity; 
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return quantity * price;
	}
	
	public void addProducts (int value) {
		quantity = quantity + value;
	}
	
	public void removeProducts (int value) {
		quantity = quantity - value;
	}
	
	public String toString(){
		return name;
	}
	
	
}
