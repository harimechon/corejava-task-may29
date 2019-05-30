package org.test;

public class Method_overriding1 extends Method_overriding {
	public void bsc() {
	System.out.println("course1");
	}
	public void bEd() {
		System.out.println("course2");
	}
		private void bA() {
			System.out.println("course3");
		}
		@Override
		public void ug() {
			System.out.println("course4");
		}
		@Override
		public void pg() {
			System.out.println("course5");
		
		}
		public static void main(String[]args) {
			Method_overriding1 a=new Method_overriding1();
			a.bEd();
			a.bsc();
			a.pg();
			a.ug();
			a.bA();
		
	
		}
			

	}
	
	


