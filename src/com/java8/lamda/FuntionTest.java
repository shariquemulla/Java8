package com.java8.lamda;

import java.util.function.Function;

public class FuntionTest {
	
	// Function<T,R> -- FI with method apply(T t), returns R type
	
	// BiFunction<T1,T2,R> -- FI with method apply(T1 t1, T2 t2), returns R type
	
	public static void main2(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		System.out.println(f.apply(10));
		
		Function<String, Integer> f1 = s -> s.length();
		System.out.println(f1.apply("asdasdasd"));
		
	}
	
	public static void main3(String[] args) {
		Student[] array = {	new Student("Student 1", 67),
							new Student("Student 2", 55),
							new Student("Student 3", 97),
							new Student("Student 4", 70),
							new Student("Student 5", 30)};
		
		Function<Student, String> getGrade = student -> {
			return student.marks >= 80 ? "A" : 
					student.marks >= 60 ? "B" :
						student.marks >= 40 ? "C" : "Failed";
		};
		
		for(Student student : array)
			System.out.println(student.name + " : " + getGrade.apply(student));
	}
	
	public static void main(String[] args) {
		// Function Chaining
		//		f1.andThen(f2).apply(x) - first f1 followed by f2
		//		f1.compose(f2).apply(x) - first f2 followed by f1
		
		Function<Integer, Integer> f1 = i -> i*2;
		Function<Integer, Integer> f2 = i -> i*i*i;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
	}

	static class Student{
		String name;
		Integer marks;
		
		public Student(String name, Integer marks) {
			this.name = name;
			this.marks = marks;
		}
	}
	
}
