package com.java8.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MultithreadingAndCollections {

	public static void main2(String[] args) {
		Thread t = new Thread(() -> {
			for(int i=0; i<10; i++){
				System.out.println("Child Thread");
			}
		});
		t.start();
		for(int i=0; i<10; i++){
			System.out.println("Main Thread");
		}
	}
	
	public static void main3(String[] args) {
		List<Integer> list = Arrays.asList(15,0,25,10,30,5,20);
		// Equivalent to writing a Comparator without lambda Expression 
//		Comparator<Integer> c = (i1, i2) -> (i1>i2) ? -1 : (i2>i1) ? 1 : 0;
//		Collections.sort(list, c);
		Collections.sort(list, (i1, i2) -> (i1>i2) ? -1 : (i2>i1) ? 1 : 0);
		
		System.out.println(list);
		System.out.println("----------------------------");
		list.forEach(System.out :: println);
		System.out.println("----------------------------");
		list.stream().forEach(System.out::println);
		System.out.println("----------------------------");
		list.stream().filter(i -> i%2==0).forEach(System.out::println);
	}

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("aaaaaa", 5454654));
		list.add(new Employee("hddddd", 3216545));
		list.add(new Employee("mmmmmm", 1011022));
		list.add(new Employee("ggggggg", 8585858));
		list.add(new Employee("eeeeeee", 6161616));
		list.add(new Employee("eeeeeee", 1011022));
		Collections.sort(list, (e1,e2) -> e1.getName().compareTo(e2.getName()));
		System.out.println(list);
	}
}

class Employee {
	private String name;
	private Integer number;
	
	public Employee(String name, Integer number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	@Override
	public String toString() {
		return this.number + ":" +this.name;
	}
}
