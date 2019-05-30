package org.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Userdefine_map {
	public static void main(String[] args) {
		Map<Integer, Userdefine> li = new LinkedHashMap<>();
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
		li.put(1, s);
		li.put(2, s1);
		li.put(3, s2);

		Set<Entry<Integer, Userdefine>> entrySet = li.entrySet();
		for (Entry<Integer, Userdefine> x : entrySet) {
			System.out.println(x.getKey() + "    emloyee details");
			System.out.println("id is  " + x.getValue().getId());
			System.out.println("name is  " +x.getValue().getName());
			System.out.println("phno is  " +x.getValue().getPhno());
		}

	}

}
