package com.miempresa.app;

import com.github.javafaker.Faker;
import com.miempresa.app.modelo.EmployeeManager;

/**
 * @author David Romero Mateu
 * @version 1.0
 */

public class App {
	
	/**
	 * @param String[] args puede almacenar un grupo de cadenas
	 */
	
	public static void main(String[] args) {
		Faker faker = new Faker();
		EmployeeManager manager = new EmployeeManager();
		manager.addEmployee("John Doe", 5);
		manager.addEmployee("Jane Smith", 2);
		
		
		for(int i=0; i<100; i++) {
			
			manager.addEmployee(faker.name().name(), faker.number().numberBetween(3, 20));
			
		}
		
		manager.printEmployees();
	}
}
