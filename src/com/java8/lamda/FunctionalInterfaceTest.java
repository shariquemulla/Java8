package com.java8.lamda;

public class FunctionalInterfaceTest {

	// Functional Interface -> Interfaces which contains a single abstract method
	// Eg. 	Runnable 		==> run()
	//		Comparable 		==> compareTo()
	//		Comparator 		==> compare()
	//		Callable 		==> call()
	//		ActionListener 	==> actionPerformed()

	// @FunctionalInterface for Custom Funtional Interfaces

	public static void main(String[] args) {
		// No need of implementation class
		TestInterface i = () -> System.out.println("Hello..Lamda Expression/Functional Interface");
		i.print();
		
		AddInterface addInterface = (a,b) -> System.out.println("Sum is "+(a+b));
		addInterface.add(200, 500);
	}
	
	// Functional Interface with 1 abstract method
	interface TestInterface {
		public void print();
	}
	
	// Functional Interface with 1 abstract method
	interface AddInterface {
		public void add(int a, int b);
	}

}
