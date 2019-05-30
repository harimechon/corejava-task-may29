package org.test;

public class singleton {
	static singleton  emp;
	public singleton() {
		// TODO Auto-generated constructor stub
	}
	public static singleton getObject() {
		if(emp==null) {
			emp=new singleton();
		}
		System.out.println(emp);
		return emp;

	}
	public void empId() {
		System.out.println("id is 351468484  " );
		
		}
	public void empName() {
		System.out.println("name is hariprasath");

	}
public static void main(String[] args) {
	singleton e=new singleton();
	e.empId();
	e.empName();
}
}
