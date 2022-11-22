package myproj;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class collectionstask {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		collectionstask s = new collectionstask();
		s.task();
	}

	public void task() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the customer details:");
		String a = sc.nextLine();
		System.out.println(a);
		String[] arrOfa = a.split(",");
		System.out.println(Arrays.toString(arrOfa));

		if (arrOfa.length != 11) {
			System.out.println("Exception in thread \"main\" java.lang.StringIndexOutOfBoundsException");
			task();
		} else {
			System.out.println("Proceed...");
		}

		System.out.println("Enter the address:");
		String c = sc.nextLine();
		String[] arrOfa1 = c.split(",");
		System.out.println(Arrays.toString(arrOfa1));
		if (arrOfa1.length != 6) {
			System.out.println("Exception in thread \"main\" java.lang.StringIndexOutOfBoundsException");
			task();
		} else {
			System.out.println("Proceed...");
		}
		System.out.println("Enter the address:");
		String d = sc.nextLine();
		String[] arrOfa2 = d.split(",");
		System.out.println(Arrays.toString(arrOfa2));
		if (d.equals("no")) {
			System.out.println("Proceed...");
			HashMap<String, String> map1 = new HashMap<String, String>();
			map1.put(c, d);
			HashMap<String, HashMap<String, String>> map2 = new HashMap<String, HashMap<String, String>>();
			map2.put(a, map1);
			System.out.println(map2);

		} else {
			if (arrOfa2.length != 6) {
				System.out.println("Exception in thread \"main\" java.lang.StringIndexOutOfBoundsException");
				task();
			} else {
				System.out.println("Proceed...");
			}

			HashMap<String, String> map1 = new HashMap<String, String>();
			map1.put(c, d);
			HashMap<String, HashMap<String, String>> map2 = new HashMap<String, HashMap<String, String>>();
			map2.put(a, map1);
			System.out.println(map2);

		}
	}
}