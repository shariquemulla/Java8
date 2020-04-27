package com.java8.lamda;

import java.util.function.Supplier;

public class SupplierTest {

	// Supplier<T> - FI with method get(), returns T
	
	public static void main(String[] args) {
		
		Supplier<Integer> randomNumber = () -> {
			return (int)(Math.random()*1000000);
		};
		
		System.out.println(randomNumber.get());
		
	}

}
