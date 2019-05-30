package org.test;

public class Constructor {
	public Constructor() {
		this(100);
	System.out.println("iam in default constructor");
	}
	public Constructor(String name,float sal) {
		System.out.println(name);
		System.out.println(sal);
		
	}
	public Constructor(int id) {
		this("hari",8984484.18f);
		System.out.println(id);
	}
	public static void main(String[] args) {

		Constructor e1=new Constructor();
		
		
		
	}

}
