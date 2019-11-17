package com.Ehipte.SenlaTasks.Task5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите последовательность чисел: ");
		String str = sc.nextLine();
		FindPalindrom.findPalindorms(str);
	}

}
