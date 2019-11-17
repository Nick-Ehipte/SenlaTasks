package com.Ehipte.SenlaTasks.Task3;

import java.util.Arrays;

public class StringRedactor {
	public static void countOfWords(String str) {
		str = str.trim();
		String[] arrayOfWords = str.split(" ");
		int countOfWords = arrayOfWords.length;
		System.out.println("Words in a sentence  = " + countOfWords);
		Arrays.sort(arrayOfWords);
		for (int i = 0; i < arrayOfWords.length; i++) {
			arrayOfWords[i] = StringRedactor.firstUpperCase(arrayOfWords[i]);
			System.out.print(arrayOfWords[i] + " ");
		}
	}

	public static String firstUpperCase(String word) {
		return word.substring(0, 1).toUpperCase() + word.substring(1);
	}
}
