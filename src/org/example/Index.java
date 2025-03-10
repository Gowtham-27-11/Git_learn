package org.example;

import java.util.ArrayList;
import java.util.List;

public class Index {
	 public static void main1(String[] args) {
	      ArrayList<Integer> al = new ArrayList<Integer>();
	      al.add(10);
	      al.add(20);
	      al.add(30);
	      al.add(90);
	      al.add(10);
	      al.add(10);
	      al.add(40);
	      al.add(50);
	      al.add(10);
	     
	      
	      System.out.println("Index of 10: "+al.indexOf(10));
	      System.out.println("Index of 20: "+al.indexOf(20));
	      System.out.println("Index of 30: "+al.indexOf(30));
	      System.out.println("Index of 90: "+al.indexOf(90));
	      System.out.println("Index of 10: "+al.indexOf(10));
	      System.out.println("Index of 10: "+al.indexOf(10));
	      System.out.println("Index of 40: "+al.indexOf(40));
	      System.out.println("Index of 50: "+al.indexOf(50));
	      System.out.println("Index of 10: "+al.indexOf(10));
	      System.out.println("Index of 70: "+al.indexOf(70));
	      

}

	 public static void main(String[] args)
	    {
	        List<Integer> al = new ArrayList<>();
	        al.add(10);
	        al.add(20);
	        al.add(30);
	        al.add(1);
	        al.add(2);
	  
	        // Calculate index of last element
	        int index = al.size() - 1;
	  
	        // Delete last element by passing index
	        al.remove(index);
	  
	        System.out.println("Modified ArrayList : " + al);
	        System.out.println("Git is competed");
	        System.out.println("Git is competed and learning jenkins");
	    }
	}

