package com.miempresa.app.controlador;
/**
 * @author David Romero Mateu
 * @version 1.0
 */
public class Employee {
	
	private String name;
	private Integer year;
	
	public Employee(String name, Integer year) {
		
		this.name = name;
		this.year = year;
	}

	
	/**
	 * @return el atributo name
	 */ 
	
	public String getName() {
		
		return name;
		
	}
	
	/**
	 * @param name el nombre
	 */ 
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	/**
	 * @return el atributo year
	 */ 
	
	public Integer getYear() {
		
		return year;
		
	}
	
	/**
	 * param year el año en la empresa
	 */ 
	
	public void setYear(Integer year) {
		
		this.year = year;
		
	}
	
	/**
	 * @return devulve una cadena
	 */ 

	public String toString () {
		
		return "Name: " + getName() + "\n" +  
				"Year: " + getYear();
		
	}
	
	

}
