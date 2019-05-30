package org.test;

import java.util.ArrayList;
import java.util.List;

public class Userdefine_list {
	public static void main(String[] args) {
		List<Userdefine> li = new ArrayList();
		Userdefine s = new Userdefine();
		s.setId(1);
		s.setName("hariprasath");
		s.setPhno(8754649406l);
		Userdefine s1 = new Userdefine();
		s1.setId(2);
		s1.setName("preethi");
		s1.setPhno(564928569l);
		Userdefine s2 = new Userdefine();
		s2.setId(3);
		s2.setName("selvaraj");
		s2.setPhno(9715874781l);
		li.add(s);
		li.add(s1);
		li.add(s2);
for (int i = 0; i < li.size(); i++) {
	System.out.println("id is  "+li.get(i).getId());
	System.out.println("name is  "+li.get(i).getName());
	System.out.println("phno is  "+li.get(i).getPhno());
	
	
}
		
	}
}
