package com.manish.java8;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(10);
		p1.setFirstName("Manish");
		p1.setLastName("Peshwani");
		
		Objects.requireNonNull(p1);
		
		Predicate<Person> predicate1 = p -> p.getAge() > 5;
		Predicate<Person> predicate2 = p -> p.getAge() < 18;
		
		boolean result = predicate1.and(predicate2).test(p1);
		System.out.println(result);
 
	}

}
