package org.example;

import java.util.ArrayList;

public class RemoveIndex {
	 public static void main(String[] args) {        
	        
	        ArrayList<Integer> numList = new ArrayList<Integer>();
	        numList.add(10);
	        numList.add(20);
	        numList.add(30);
	        numList.add(90);
	        numList.add(10);
	        numList.add(10);
	        numList.add(40);
	        numList.add(50);
	        numList.add(30);
	        ArrayList<Integer> numList1 = new ArrayList<Integer>();
	        numList1.add(60);
	        numList1.add(70);
	        numList1.add(80);
	        numList1.add(90);
	        System.out.println(numList);
	        numList1.retainAll(numList);
	        System.out.println(numList1);
	        
	    
	        
	    }
	}

