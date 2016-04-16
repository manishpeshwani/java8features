package com.manish.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorExample {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		
		try(
			BufferedReader br = new BufferedReader(
					new InputStreamReader(CollectorExample.class.getResourceAsStream("personList.txt")));
			Stream<String> stream = br.lines();
		){
			stream.map(line -> {
				String[] s = line.split(" ");
                Person p = new Person(s[0].trim(), Integer.parseInt(s[1]));
                persons.add(p);
                return p;
			}).forEach(System.out::println);
			
			
		}catch (IOException ioe) {
            System.out.println(ioe);
        }
		
		Optional<Person> personWithMinAge = 
				persons.stream().filter(p -> p.getAge() > 20).min(Comparator.comparing(Person::getAge));
		
		
		System.out.println();
		System.out.println(personWithMinAge.get());
		
		Map<Integer, String> groupedPersons = 
		        persons.stream()
		                .collect(
		                        Collectors.groupingBy(
		                                Person::getAge, 
		                                Collectors.mapping(
		                                        Person::getFirstName, 
		                                        Collectors.joining(", ")
		                                )
		                        )
		                );
		
		System.out.println(groupedPersons);

	}

}
