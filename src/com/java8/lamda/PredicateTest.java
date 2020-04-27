package com.java8.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	// Predicate<T> -- FI with method test(T t), returns boolean
	
	// BiPredicate<T1,T2> -- FI with method test(T1 t1, T2 t2), returns boolean
	
	public static void main2(String[] args) {
//		Predicate<Integer> p = a -> a%2==0;
		IntPredicate p = a -> a%2==0;
		System.out.println(p.test(10));
		System.out.println(p.test(11));
		
		EmployeePredicate emp = new EmployeePredicate("TEst", 10000L, "Java");
		Predicate<EmployeePredicate> p1 = e -> e.salary>15000 && e.department.equals("Java");
		System.out.println(p1.test(emp));
		
		List<EmployeePredicate> list = new ArrayList<>();
		list.add(new EmployeePredicate("aaaaa", 10200L, "IT"));
		list.add(new EmployeePredicate("bbbbb", 5000L, "IT"));
		list.add(new EmployeePredicate("eeeee", 11000L, "IT"));
		list.add(new EmployeePredicate("wwwww", 7000L, "IT"));
		list.add(new EmployeePredicate("qqqqq", 15000L, "IT"));
		
		Predicate<EmployeePredicate> p2 = e2 -> e2.salary<10000;
		for(EmployeePredicate emp2 : list) {
			if(p2.test(emp2))
				System.out.println(emp2.name + ":" + emp2.salary);
		}
	}
	
	public static void main(String[] args) {
		Integer[] array = {0,5,10,15,20,25,30};
//		Predicate<Integer> evenPredicate = i -> i%2==0;
		IntPredicate evenPredicate = i -> i%2==0;
//		Predicate<Integer> greaterThanPredicate = i -> i>10;
		IntPredicate greaterThanPredicate = i -> i>10;
		
		System.out.println("Even and Greater than 10");
		for(Integer i : array) {
			if(evenPredicate.and(greaterThanPredicate).test(i))
				System.out.println(i);
		}
		
		System.out.println("Even or Greater than 10");
		for(Integer i : array) {
			if(evenPredicate.or(greaterThanPredicate).test(i))
				System.out.println(i);
		}
		
		System.out.println("not Greater than 10");
		for(Integer i : array) {
			if(greaterThanPredicate.negate().test(i))
				System.out.println(i);
		}
	}
}

class EmployeePredicate {
	public String name;
	public Long salary;
	public String department;
	
	public EmployeePredicate(String name, Long salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
}
