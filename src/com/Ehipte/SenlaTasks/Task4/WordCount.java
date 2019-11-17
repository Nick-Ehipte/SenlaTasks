package com.Ehipte.SenlaTasks.Task4;

public class WordCount {
	public static void howManyTimeWordIsUsedInTheText(String text, String word) {
		text = text.replace("," ," ");
		text = text.replace("." ," ");
		String[] arrayOfWords = text.split(" ");
		text = text.trim();
		int howMany = 0;
		for (int i = 0; i < arrayOfWords.length; i++) {
			if (arrayOfWords[i].equalsIgnoreCase(word)) {
				howMany++;
			}
		}
		System.out.println("Word " + word + " found in the text " + howMany + " time");
	}
}
