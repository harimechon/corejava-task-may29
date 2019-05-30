package org.test;

public class Abstract1 extends Abstract {

	@Override
	public void cost() {
		System.out.println("150000rs");
		
	}
	@Override
	public void speed() {
		System.out.println("250ms");
	}
	public void milage() {
		System.out.println("50kmpl");

	}
	public void hp() {
		System.out.println("200hp");
		}
	public static void main(String[] args) {
		Abstract1 model=new Abstract1();
		model.cost();
		model.speed();
		model.milage();
		model.rpm();
		model.hp();
		
	}
	
		
	}


