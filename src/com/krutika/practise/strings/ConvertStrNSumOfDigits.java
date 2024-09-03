package com.krutika.practise.strings;

public class ConvertStrNSumOfDigits {

	public static void main(String[] args) {
		String s = "iiii";
		int k = 1;
		ConvertStrNSumOfDigits obj = new ConvertStrNSumOfDigits();
		int answer = obj.getLucky(s, k);
		System.out.println(answer);
	}

	public int getLucky(String s, int k) {
		StringBuilder sb = new StringBuilder();
		int sum1 = 0;
		for (char c : s.toCharArray()) {
			int num = c - 96;// convert char to int
			while (num > 0) {
				sum1 += (num % 10);
				num /= 10;
			} 
		}
		sb.append(sum1);
		while (k > 1) {
			int sum = 0;
			for (int i = 0; i < sb.length(); i++) {
				sum += (sb.charAt(i) - '0'); // sum the chars in sb
			}
			k--;
			sb = new StringBuilder(String.valueOf(sum));
		}
		return Integer.parseInt(sb.toString());
	}
}
