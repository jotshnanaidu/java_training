package day4;

import java.util.*;

public class Dictionaries_HashMaps_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Map<String, Integer> Contact = new HashMap<String, Integer>();
		System.out.println("Enter the number of entries in the phonebook:");
		int n = sc.nextInt();
		System.out.println("Enter name and corresponding number:");
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int phone = sc.nextInt();
			Contact.put(name, phone);
		}
		ArrayList<String> output = new ArrayList<String>();
		System.out.println("Enter name: if you dont want to enter anymore names enter 'exit'");
		while (sc.hasNext()) {
			String s = sc.next();
			if (Contact.containsKey(s)) {
				output.add(s + "=" + Contact.get(s));
			} else if (s.equals("exit")) {
				break;
			} else {
				output.add("Not found");
			}
		}
		for (String i : output) {
			System.out.println(i);
		}

	}

}
