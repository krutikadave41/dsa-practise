package com.krutika.practise.strings;

import java.util.HashMap;
import java.util.Map;

public class SortSentence1859 {

	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";

		SortSentence1859 obj = new SortSentence1859();
		System.out.println(obj.sortSentence(s));
	}

	public String sortSentence(String s) {
		String[] arr = s.split(" ");
		Map<Integer, String> map = new HashMap<Integer, String>();

		for (String str : arr) {
			int index = str.charAt(str.length() - 1);
			String value = str.substring(0, str.length() - 1);
			map.put(index, value);
		}
		StringBuilder sb = new StringBuilder();
		for (String str : map.values()) {
			sb.append(str).append(" ");
		}

		return sb.toString().trim();
	}
}
