package edu.uprm.cse.datastructures.list.problems;

import edu.uprm.cse.datastructures.list.ArrayList;
import edu.uprm.cse.datastructures.list.List;

public class Reverse {
	// DO NOT MODIFY ANYTHING
	public static void main(String[] args) {
		List<String> L = new ArrayList<String>();
		L.add("Kim");
		L.add("Ned");
		L.add("Ron");
		L.add("Jil");
		L.add("Amy");
		L.add("Ron");
		
		System.out.println("List in forward order: ");
		for (String s: L) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("List in reverse order: ");
		List<String> R = L.reverse();
		for (String s: R) {
			System.out.println(s);
		}
	
	}

}
