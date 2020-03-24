package application;

import java.util.Scanner;

import entities.Student;

public class TestStudent {
	
	

	public static void main(String[] args) {
		
		String n1;
		double v1, v2, v3;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Write name, value 1, 2 and 3 from student: ");
		n1 = sc.next();
		v1 = sc.nextDouble();
		v2 = sc.nextDouble();
		v3 = sc.nextDouble();
		
		Student s1 = new Student(n1, v1, v2, v3);
		
		System.out.println("FINAL GRADE = " + s1.getFinalGrade());
		System.out.println(s1.getSituation());
		System.out.println("MISSING " + s1.getMissingPoints() + " TO PASS");
		
		sc.close();
	}

}
