package com.Ehipte.SenlaTasks.Task1;

public class MathDecision {
	private static boolean check = false;

	public static void isSimple(int number) {
		if (number % 1 != 0) {
			System.out.println("Введите целое число!");
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
			System.out.println("Число " + number + " чётное");
		} else {
			System.out.println("Число " + number + " нечётное");
		}

	}

	private static void getConclusion(int number) {
		if (check) {
			System.out.println("Число " + number + " явлется составным");
		} else {
			System.out.println("Число " + number + " простое");
		}
	}

}
