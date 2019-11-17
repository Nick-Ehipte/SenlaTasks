package com.Ehipte.SenlaTasks.Task1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите число: ");
		int number = sc.nextInt();
		MathDecision.isSimple(number);
		MathDecision.isEvenNumber(number);
	}

}
