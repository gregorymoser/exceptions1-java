package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> list = new ArrayList <Employee>();
		
		System.out.println("How many employees will be registred?");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println();
			System.out.println("Employee #"+i+": ");
			System.out.println("Id: ");
			int id = sc.nextInt();
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");		
		}
		else {
			System.out.println("Enter the porcentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {//for each
			System.out.println(obj);
		}
				
		sc.close(); 
		
		
		
		
		
	}
}