package com.java8.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(25);
		list.add(0);
		list.add(35);
		list.add(5);
		list.add(30);

		// Filter and Collectors
//		list = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//		list.stream().forEach(System.out::println);

		// Map : Update and collect
//		list = list.stream().map(i -> i+5).collect(Collectors.toList());
//		list.stream().forEach(System.out::println);
		
		// Count() 
//		long count = list.stream().filter(i -> i>20).count();
//		System.out.println(count);
		
		// Sorted() - ASC and DESC using Comparator
//		list = list.stream().sorted().collect(Collectors.toList());
//		list = list.stream().sorted((i1, i2) -> (i1<i2) ? 1 : (i1>i2) ? -1 : 0).collect(Collectors.toList());
//		list = list.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
//		list.stream().forEach(System.out::println);
		
//		List<String> list2 = new ArrayList<>();
//		list2.add("aaaaa daa");
//		list2.add("nnnn gnnng");
//		list2.add("bvbvb");
//		list2.add("oooo kk");
//		list2.add("mOOsff f");
//		list2.add("zdgdg gds");
//		
//		list2 = list2.stream().sorted((s1,s2) -> {
//			int l1 = s1.length();
//			int l2 = s2.length();
//			return (l1>l2) ? 1 : (l1<l2) ? -1 : 0;
//		}).collect(Collectors.toList());
//		System.out.println(list2);
		
		// min() and max() - min and max value according to the sorting order
//		Integer min = list.stream().min((i1,i2) -> i1.compareTo(i2)).get();
//		Integer max = list.stream().max((i1,i2) -> i1.compareTo(i2)).get();
//		System.out.println(min +" "+ max);
		
		// forEach(Consumer c)
//		list.stream().forEach(i -> System.out.println("Square of "+i+" is: "+ i*i));
		
		// toArray
		Integer[] i = list.stream().toArray(Integer[]::new);
		Stream.of(i).forEach(System.out::println);
	}

}
