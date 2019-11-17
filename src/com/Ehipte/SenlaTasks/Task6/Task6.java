package com.Ehipte.SenlaTasks.Task6;

import java.util.ArrayList;
import java.util.List;

public class Task6 {
	public static void main(String[] args) {
		Backpack backpack = new Backpack(90);

		List<Thing> things = new ArrayList<>();

		things.add(new Thing("Pen", 5, 2));
		things.add(new Thing("Note", 70, 45));
		things.add(new Thing("Knife", 24, 6));
		things.add(new Thing("Phone", 1120, 95));

		for (Thing i : things) {
			System.out.println(backpack.putThings(i));
		}

		for (Thing i : backpack.getArrayThings()) {
			System.out.println(i);
		}

		System.out.println("Max value : " + backpack.getSumAmount());

	}
}
