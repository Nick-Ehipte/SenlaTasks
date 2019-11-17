package com.Ehipte.SenlaTasks.Task5;

import java.util.ArrayList;
import java.util.List;

public class FindPalindrom {
	public static void findPalindorms (String str) {
	List<String> palindromeList = new ArrayList<>();
		for(int charIdx = 0;charIdx < str.length()-1;charIdx++){

			int start = charIdx - 1;
			int end = charIdx + 1;

			while (end < str.length() && str.charAt(charIdx) == str.charAt(end)) {
				end++;
			}
			charIdx = end - 1;

			while (start >= 0 && end < str.length()) {
				if (str.charAt(start) == str.charAt(end)) {
					start--;
					end++;
				} else {
					break;
				}
			}

			if (end - start >= 3) {
				palindromeList.add(str.substring(start + 1, end));
			}
		}

		for(
		String palindrome:palindromeList)
		{
			System.out.print(palindrome + " ");
		}
}
}
