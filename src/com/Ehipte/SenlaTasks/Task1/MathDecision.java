package com.Ehipte.SenlaTasks.Task1;

public class MathDecision {
	private static boolean check = false;

	public static void isSimple(int number) {
		if (number % 1 != 0) {
			System.out.println("Enter an integer!");
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					check = true;
				}
			}
			getConclusion(number);
		}
	}

	public static void isEvenNumber(int number) {

		if (number % 2 == 0) {
			System.out.println("Number " + number + "is even");
		} else {
			System.out.println("Number " + number + " is odd");
		}

	}

	private static void getConclusion(int number) {
		if (check) {
			System.out.println("Number " + number + " is simple");
		} else {
			System.out.println("Number " + number + " is compound");
		}
	}

}
