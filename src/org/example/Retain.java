package org.example;

import java.util.ArrayList;

public class Retain {
	 public static void main(String args[]){  
		  //create and initialize ArrayList
		  ArrayList<Integer> List=new ArrayList<Integer>();  
		  List.add(10);  
		  List.add(20);  
		  List.add(30);
		  List.add(40);
		  List.add(50);
		  List.add(60);
		  List.add(70);
		  List.add(80);
		  
		  System.out.println(List);
		  
		  //define another collection
		  ArrayList<Integer> List2=new ArrayList<Integer>();    
		  List2.add(100);
		  List2.add(200);
		  List2.add(300);
		  List2.add(400);
		  List2.add(500);
		  List2.add(600);
		  List2.add(700);
		  List2.add(8000);
		 
		  System.out.println(List2);
		 
		  List.removeAll(List2);
	
		  System.out.println(List);
		 }  
		}

