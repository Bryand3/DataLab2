package edu.uprm.cse.datastructures.list.problems;

import edu.uprm.cse.datastructures.list.ArrayList;
import edu.uprm.cse.datastructures.list.List;

public class TotalCount {

	private static int totalCount(String s, Object[] listArray) {
		// ADD YOUR CODE HERE
		int count = 0;
		for (int i = 0; i < listArray.length; i++) {
			List<String> elements =  (List<String>) listArray[i];
			for (int j = 0; j < elements.size(); j++) {
				if(elements.get(j).equals(s)) count++;
			}
		}
			
		
		return count;
	}
	
	
	public static void main(String[] args) {
		Object[] lists = new Object[3];
		lists[0] = new ArrayList<String>();
		lists[1] = new ArrayList<String>();
		lists[2] = new ArrayList<String>();
		
		List<String> temp = (List<String>) lists[0];
		temp.add("Bob");
		temp.add("Ron");
		temp.add("Kim");
		temp.add("Bob");

		temp = (List<String>) lists[1];
		temp.add("Bob");
		temp.add("Amy");

		temp = (List<String>) lists[2];
		temp.add("Joe");
		temp.add("Apu");
		temp.add("Jil");
		temp.add("Ned");
		temp.add("Pol");
		
		int count = totalCount("Bob", lists);
		System.out.printf("Count Bob : %s, expected 3. Correct: %s\n", count, count == 3);
		count = totalCount("Lu", lists);
		System.out.printf("Count Lu : %s, expected 0. Correct: %s\n", count, count == 0);

		
	}



}
