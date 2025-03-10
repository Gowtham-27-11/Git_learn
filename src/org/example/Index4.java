package org.example;

import java.util.LinkedList;

public class Index4 {
	public static void main(String[] args) {
		LinkedList<Integer>a=new LinkedList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(600);
		a.add(700);
		System.out.println("List is:"+a);
		int i=a.get(4);
		System.out.println("Value present at 4th index:"+i);
		
	}

}
