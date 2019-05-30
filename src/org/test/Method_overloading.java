package org.test;

public class Method_overloading {
	public void greensomr(int a, int b) {
		System.out.println(a - b);
	}

	public void greensomr(long a, long b) {
		System.out.println(a - b);
	}

	public void greensomr(float a, float b) {
		System.out.println(a - b);
	}

	public void greensomr(char a, char b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		Method_overloading z = new Method_overloading();
		z.greensomr(111111111, 222222222);
		z.greensomr(215155446l, 4455431564l);
		z.greensomr(1464461.5115f, 184894.5164f);
		z.greensomr(1, 2);

	}

}
