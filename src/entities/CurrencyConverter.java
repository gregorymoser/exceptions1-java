package entities;

public class CurrencyConverter {
	public static final double DOLAR = 3.10;
	
	public static double converter (double quantity) {
		return quantity * DOLAR;
	}
}
