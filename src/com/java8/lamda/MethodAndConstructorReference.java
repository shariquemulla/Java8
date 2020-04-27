package com.java8.lamda;

public class MethodAndConstructorReference {

	public MethodAndConstructorReference() {
		for(int i=0; i<10; i++){
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {
		
		// Method Reference
		// Thread t = new Thread(MethodAndConstructorReference :: m1);
		
		// Constructor Reference
		Thread t = new Thread(MethodAndConstructorReference :: new);
		t.start();
		for(int i=0; i<10; i++){
			System.out.println("Main Thread");
		}
	}
	
	public static void m1() {
		for(int i=0; i<10; i++){
			System.out.println("Child Thread");
		}
	}

}
