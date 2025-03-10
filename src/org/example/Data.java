package org.example;

import java.util.ArrayList;
import java.util.List;

public class Data {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		int a =l.remove(10);
		System.out.println(a);
		
		
	}

}
