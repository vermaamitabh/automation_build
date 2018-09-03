package com.edunacor;

import com.edunacor.DataService;

public class MyMath {	
	
	//DataService is an dependency to fetch data array
	private DataService dataService;
	
	//constructor to attach data service interface impl
	public MyMath(DataService dataService) {
		super();
		this.dataService = dataService;
	}	
	
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
	
	int findGreatestFromAllData() {
		int greatest=Integer.MIN_VALUE;
		int[] data =dataService.retrieveAllData();
		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}
