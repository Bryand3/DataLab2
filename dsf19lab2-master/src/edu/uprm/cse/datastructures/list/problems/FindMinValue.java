package edu.uprm.cse.datastructures.list.problems;

import edu.uprm.cse.datastructures.list.ArrayList;
import edu.uprm.cse.datastructures.list.List;

public class FindMinValue {

	public static int findMinValue(List<Integer> L) {
		// ADD CODE HERE
		if(L.isEmpty()) {
			return 0;
		}
		
		int min = L.get(0);
		for(int i = 0; i<L.size(); i++) {
			if(min>L.get(i)) {
				min=L.get(i);
			}
		}return min;
	}
	
	
	public static void main(String[] args) {
		List<Integer> L = new ArrayList<Integer>();
		L.add(10);
		L.add(1000);
		L.add(2);
		L.add(1);
		L.add(56);
		L.add(4);
		int min = findMinValue(L);
		System.out.printf("Min Value: %s, expected 1. Correct: %s", min, min == 1);
		System.out.println();
		
		L.clear();
		L.add(20);
		L.add(-1);
		L.add(-2);
		L.add(8);
		L.add(56);
		L.add(20);
		L.add(120);
		min = findMinValue(L);
		System.out.println();
		System.out.printf("Min Value: %s, expected -2. Correct: %s", min, min == -2);
	}

}
