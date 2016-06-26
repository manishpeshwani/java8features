package com.manish.java8.mathoperation;

public class MathTest {

	public static void main(String[] args) {
		MathTest mathTest = new MathTest();
		
		MathOperation addition = (a, b) -> a+b;
		
		MathOperation subtraction = (a, b) -> a-b;
		
		int value = mathTest.operate(5, 5, addition);
		System.out.print(value);
		System.out.println();
		
		value = mathTest.operate(5, 5, subtraction);
		System.out.print(value);
	}
	
	public int operate(int a, int b, MathOperation op){
		return op.operate(a, b);
	}

}
