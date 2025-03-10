package org.example;

import java.util.Vector;

public class VectorAdd {
	public static void main(String[] args) {
		Vector<Integer> a=new Vector<Integer>();
		a.add(105);
		a.add(205);
		a.add(305);
		a.add(405);
		a.add(505);
		a.add(605);
		a.add(705);
		a.add(805);
		System.out.println("List is:"+a);
		int len=a.size();
		System.out.println("Length of the array is"+len);
		
	}

}
