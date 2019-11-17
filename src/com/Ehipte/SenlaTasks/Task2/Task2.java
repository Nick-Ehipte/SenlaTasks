package com.Ehipte.SenlaTasks.Task2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scOne = new Scanner(System.in);
		System.out.println("Insert the number: ");
		int num1 = scOne.nextInt();
		@SuppressWarnings("resource")
		Scanner scTwo = new Scanner(System.in);
		System.out.println("Insert the number: ");
		int num2 = scTwo.nextInt();
		System.out.println("Greatest common divisor = " + CalculationGCD_LCM.isGreatestCommonDivisor(num1, num2));
		System.out.println("Least common multipleå  = " + CalculationGCD_LCM.isLeastCommonMultiple(num1, num2));
	}

}
