package org.test;

public class singleton2 {
	static singleton2  emp;
	public singleton2() {
		// TODO Auto-generated constructor stub
	}
	public static singleton2 getObject() {
		if(emp==null) {
			emp=new singleton2();
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
	singleton2 e=new singleton2();
	e.empId();
	e.empName();
}
}
