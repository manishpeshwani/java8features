package com.manish.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstStreamExample {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one","two","three","four","five");
		
		Predicate<String> p1 = s -> s.length() > 3;
		
		stream.
			filter(p1).
			forEach(s1 -> System.out.println(s1));
		
		List<String> list = Arrays.asList("one","two","three","four","five");
		
		list.stream().
			filter(p1).
			forEach(s1 -> System.out.println(s1));
	}

}
