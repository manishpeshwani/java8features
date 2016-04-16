package com.manish.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainedConsumer {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Manish", "Peshwani");
		
		Consumer<String> printer = System.out::println;
		
		List<String> result = new ArrayList<String>();
		
		Consumer<String> listAdder = result::add;
		
		//Chained the consumers by andThen
		strings.forEach(printer.andThen(listAdder));
		
		System.out.println("result list has " + result.size() + " elements.");

	}

}
