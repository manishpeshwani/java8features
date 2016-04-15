package com.manish.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyFirstLamdaExpression {

	public static void main(String[] args) {
		Comparator<String> comparator = 
				(s1, s2) -> Integer.compare(s1.length(), s2.length());
				
		String[] valuesToCompare = {"Manish" , "Peshwani", "P"};
		Arrays.sort(valuesToCompare,comparator);
		
		for(String value: valuesToCompare){
			System.out.println(value);
		}

	}

}
