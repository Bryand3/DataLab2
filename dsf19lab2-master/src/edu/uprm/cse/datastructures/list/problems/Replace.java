package edu.uprm.cse.datastructures.list.problems;

import edu.uprm.cse.datastructures.list.ArrayList;
import edu.uprm.cse.datastructures.list.List;

public class Replace {
	// DO NOT MODIFY ANYTHING

	public static void main(String[] args) {
		List<String> L = new ArrayList<String>();
		L.add("Kim");
		L.add("Ned");
		L.add("Ron");
		L.add("Jil");
		L.add("Amy");
		L.add("Ron");
		L.add("Ron");

		
		System.out.println("List before replace: ");
		for (String s: L) {
			System.out.println(s);
		}
		
		System.out.println();
		int c = L.replaceAll("Ron", "Apu");
		System.out.printf("Replace count: %s, expected: 3, correct: %s\n ", c, c==3);
		System.out.println("List after replace: ");
		for (String s: L) {
			System.out.println(s);
		}
	}

}
