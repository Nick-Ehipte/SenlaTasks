package com.Ehipte.SenlaTasks.Task4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource") 
		Scanner scOne = new Scanner(System.in);
		System.out.println("Enter offer: ");
		String text = scOne.nextLine();
		@SuppressWarnings("resource")
		Scanner scTwo = new Scanner(System.in);
		System.out.println("Enter word ");
		String word = scTwo.next();
		WordCount.howManyTimeWordIsUsedInTheText(text, word);
	}

}
