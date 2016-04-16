package com.manish.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapFunctionTest {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> list2 = Arrays.asList(2,4,7);
		List<Integer> list3 = Arrays.asList(4,5,6,7);
		
		List<List<Integer>> list = Arrays.asList(list1, list2, list3);
		
		Function<List<?>, Integer> sizeFunction = l -> l.size();
		
		list.stream().map(sizeFunction).forEach(System.out::println);
	}

}
