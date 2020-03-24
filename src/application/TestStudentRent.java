package application;

import java.util.Locale;
import java.util.Scanner;

import entities.StudentRent;

public class TestStudentRent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		StudentRent [] vect = new StudentRent [10];
		
		System.out.println("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		
		for(int i=0; i<rooms; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int number = sc.nextInt();
			vect [number] = new StudentRent(name, email);			
		}
		
		System.out.println("Busy rooms: ");
		for(int i=0; i<vect.length; i++) {
			if(vect[i]!=null) {
				System.out.println(i + ": "+ vect[i].getNome()
						+ ", "+ vect[i].getEmail());
			}
		}
		
		
		sc.close();
	}

}
