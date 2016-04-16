package com.manish.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReductionExample {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,3,4);
		
		Stream<Integer> stream = integers.stream();
		
		Optional<Integer> sum = stream.reduce((i1, i2) -> i1+i2);
		
		if(sum.isPresent()){
			System.out.println(sum.get());
		}
		
		Optional<Integer> max = integers.stream().reduce(Integer::max);
		
		if(max.isPresent()){
			System.out.println(max.get());
		}
		
		
	}

}
