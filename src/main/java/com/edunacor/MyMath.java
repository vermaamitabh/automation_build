package com.edunacor;

public class MyMath {	
	
	public int Sum(int[] numbers) {
		int sum = 0;
		for (int i:numbers) {
			sum+=i;
		}
		return sum;
	}
	
	public int Subtraction(int a, int b) {
		return (b-a);
	}
	
	public int multiply(int[] numbers) {
		int mul = 1;
		for (int i:numbers) {
			mul*=i;
		}
		return mul;
	}
}
