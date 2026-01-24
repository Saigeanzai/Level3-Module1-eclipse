package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> stuff = new ArrayList<String>();
		// 2. Add five Strings to your list
		stuff.add("string0");
		stuff.add("string1");
		stuff.add("string2");
		stuff.add("string3");
		stuff.add("string4");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < stuff.size(); i++) {
			// System.out.println(stuff.get(i));
		}
		// 4. Print all the Strings using a for-each loop
		for (String i : stuff) {
			// System.out.println(i);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < stuff.size(); i++) {
			if (i % 2 == 0) {
				// System.out.println(stuff.get(i));
			}
		}
		// 6. Print all the Strings in reverse order.
		for (int i = stuff.size() - 1; i < stuff.size(); i--) {
			if (i > -1) {
				//System.out.println(stuff.get(i));
			}
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i =0; i<stuff.size(); i++) {
			char character = stuff.get(i).charAt(i);
			if (character == 'e') {
				System.out.println(stuff.get(i));
			}
		}
	}
}
