package entities;

public class Rectangle {
	public double height;
	public double width;
	
	public double area() {
		return height * width;
	}
	
	public double perimeter() {
		return 2 * (height + width);
	}
	
	public double diagonal() {
		double c = (Math.pow(height, 2)) + (Math.pow(width, 2));		
		double d = Math.sqrt(c);
		return d;
	}
	
}
