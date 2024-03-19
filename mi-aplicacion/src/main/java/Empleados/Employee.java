package Empleados;

public class Employee {
	
	private String name;
	private Integer year;
	
	public Employee(String name, Integer year) {
		
		this.name = name;
		this.year = year;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		
		return name;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	public Integer getYear() {
		
		return year;
		
	}
	public void setYear(Integer year) {
		
		this.year = year;
		
	}
	

	public String toString () {
		
		return "Name: " + getName() + "\n" +  
				"Year: " + getYear();
		
	}
	
	

}
