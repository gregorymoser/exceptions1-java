package application;

import java.util.Scanner;

import entities.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Rectangle r = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		System.out.println("AREA: " + r.area());
		System.out.println("PERIMETER: " + r.perimeter());
		System.out.println("DIAGONAL3: " + r.diagonal());
		
		sc.close();
	}

}
