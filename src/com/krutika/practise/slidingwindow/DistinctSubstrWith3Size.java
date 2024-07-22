package com.krutika.practise.slidingwindow;

public class DistinctSubstrWith3Size {

	public static void main(String[] args) {
		DistinctSubstrWith3Size obj = new DistinctSubstrWith3Size();
		String s = "xyzzaz";
		System.out.println(obj.countGoodSubstrings(s));
	}

	public int countGoodSubstrings(String s) {
		int count = 0;
		if (s.length() < 3) {
			return count;
		}

		char a = s.charAt(0);
		char b = s.charAt(1);
		char c = s.charAt(2);
		// check initial window
		if (a != b && b != c && a != c) {
			count++;
		}

		for (int i = 3; i < s.length(); i++) {
			a = b;
			b = c;
			c = s.charAt(i);
			if (a != b && b != c && a != c) {
				count++;
			}
		}
		return count;
	}
}
