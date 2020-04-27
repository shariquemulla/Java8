package com.java8.lamda;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;

public class OperatorsTest {
	
	public static void main(String[] args) {
		
//		UnaryOperator<Integer> f = i -> i*i;
		
//		IntUnaryOperator f = i -> i*i;
//		LongUnaryOperator f = i -> i*i;
		DoubleUnaryOperator f = i -> i*i;
		System.out.println(f.applyAsDouble(5.12));
		
//		BinaryOperator<Integer> bo = (a, b) -> a*b;
		
//		IntBinaryOperator bo = (a, b) -> a*b;
//		LongBinaryOperator bo = (a, b) -> a*b;
		DoubleBinaryOperator bo = (a, b) -> a*b;
		System.out.println(bo.applyAsDouble(10, 15));
		
	}

}
