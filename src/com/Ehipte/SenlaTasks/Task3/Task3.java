package com.Ehipte.SenlaTasks.Task3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource") 
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите предложение: ");
		String str = sc.nextLine();
		StringRedactor.countOfWords(str);
	}

}
