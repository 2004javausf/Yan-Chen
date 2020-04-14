package com.revature.driver;

import com.revature.beans.Human;

public class Driver {
	
	
	// single comment
	/*
	 * Multi
	 * line
	 * Comment
	 * 
	 * OOP
	 * Widespread use, great documentation
	 * 
	 * Oracle
	 * 
	 * 3 common acronyms - JDK, JRE, JVM
	 * 
	 * JVM - Java Virtual Machine
	 * 
	 * JRE - Java RUntime Environment
	 * 
	 * JDK - Java Development Kit
	 * 
	 * Object Oriented Programming
	 *  Unit of programmibility is the object
	 *  Objects have state & behavior
	 *  States - aka fields, attr, var, etc
	 *  Behaviors - methods
	 *  Classes - blueprint or template of an object
	 * */
	
	public static void main (String[]args) {
		/* public - access modifier, everything can access it (not a global scope though)
		 * static - don't need to instantiate to use
		 * void - doesn't return anything
		 * String [] args - parameter(s) used for this method
		 */
		
		System.out.println("Roll Tide");
		System.out.println("Go Bucks!");
		
		Human h = new Human();

		h.setName("Matt");
		h.setAge(34);
		h.setWeight(270);
		
		// Print out details instead of mem ref, using overriding toString method
		System.out.println(h);
		
		
		System.out.println(h.getName());
		System.out.println(h.getAge());
		System.out.println(h.getWeight());	
	}

}
