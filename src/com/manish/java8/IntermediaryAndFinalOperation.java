package com.manish.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryAndFinalOperation {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one","two","three","four","five");
		
		Predicate<String> p1 = s -> s.length() > 3;
		
		List<String> resultList = new ArrayList<String>();
		
		stream.peek(System.out::println).filter(p1).forEach(resultList::add);
		
		System.out.println(resultList.size());

	}

}
