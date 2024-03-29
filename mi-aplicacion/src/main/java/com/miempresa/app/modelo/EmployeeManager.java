package com.miempresa.app.modelo;

import java.util.ArrayList;
import java.util.List;

import com.miempresa.app.controlador.Employee;

/**
 * @author David Romero Mateu
 * @version 1.0
 */

public class EmployeeManager {
	
	List<Employee> employees = new ArrayList<Employee>();
	
	/**
	 * @param name nombre del empleado
	 * @param years años en la empresa del empleado
	 */ 
	
	public void addEmployee(String name, int years) {
		
		Employee e1 = new Employee(name, years);
		employees.add(e1);
	
		System.out.println(name + " added to the system.");
	}
	
	/**
	 * @author David Romero Mateu
	 * @version 1.0
	 */
	
	public void printEmployees() {
		System.out.println("List of employees:");
		for (Employee e : employees) {
		System.out.println(e.toString());
		}
	}
	

}
