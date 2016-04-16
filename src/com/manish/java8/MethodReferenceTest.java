package com.manish.java8;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceTest {

	public static void main(String[] args) {
		
		//Below consumers are represented as method references
		Consumer<String> printer = System.out::println;
		Consumer<Integer> intPrinter = System.out::println;
		printer.accept("Manish");
		
		//Create a person
		Person p1 = new Person();
		p1.setAge(15);
		p1.setFirstName("Manish");
		p1.setLastName("Peshwani");
		
		//This is an example of lamda expression
		Function<Person, Integer> f1 = p -> p.getAge();
		intPrinter.accept(f1.apply(p1));
		
		//This is an example of method reference an alternate way of lamda expression
		Function<Person, Integer> f2 = Person::getAge;
		intPrinter.accept(f1.apply(p1));
	}

}
