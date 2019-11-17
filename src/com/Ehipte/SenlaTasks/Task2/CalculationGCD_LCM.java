package com.Ehipte.SenlaTasks.Task2;

public class CalculationGCD_LCM {
	
	public static int isGreatestCommonDivisor(int num1, int num2) {
		if (num1 % 1 != 0 || num2 % 1 !=0) {
		System.out.println("¬ведите целые числа!");
		}else{
			while (num1 != 0 && num2 != 0) {
			int c = num1 % num2;
			num1 = num2;
			num2 = c;
		}
		
		}
		return num1;
	}
	
	public static int isLeastCommonMultiple (int num1, int num2 ) {
		int leastCommonMultiple  = num1 * num2 / isGreatestCommonDivisor(num1,num2);
		return leastCommonMultiple;
	}

}
