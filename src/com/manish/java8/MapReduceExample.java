package com.manish.java8;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(100, 200, 300);
		
		//Map example
		l.stream().map(cost -> cost*1.2).forEach(System.out::println);
		
		//Map reduce example
		double s = l.stream().map(cost -> cost*1.2).reduce((sum, cost) -> sum+cost).get();
		System.out.println(s);

	}

}
