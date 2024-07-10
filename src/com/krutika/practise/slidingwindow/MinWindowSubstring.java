package com.krutika.practise.slidingwindow;

import java.util.HashMap;

public class MinWindowSubstring {
	
	public static void main(String[] args) {
		String s = "ADOBECODEBANC", t = "ABC";
		MinWindowSubstring obj = new MinWindowSubstring();
		System.out.println(obj.minWindow(s, t));
	}

	 public String minWindow(String s, String t) {
	        int n = s.length();
	        if (t.length() > n) {
	            return "";
	        }
	        HashMap<Character, Integer> map = new HashMap<>();
	        for (char c : t.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }
	        int i = 0, j = 0;
	        int i_start = 0;
	        int requiredCount = t.length();
	        int minWindowSize = Integer.MAX_VALUE;
	        while (j < n) {
	            char ch = s.charAt(j);
	            if (map.containsKey(ch) && map.get(ch) > 0) {
	                requiredCount--;
	            }
	            map.put(ch, map.getOrDefault(ch, 0) - 1);
	            while (requiredCount == 0) {
	                int currentWindowSize = j - i + 1;
	                if (minWindowSize > currentWindowSize) {
	                    minWindowSize = currentWindowSize;
	                    i_start = i;
	                }
	                char start_char = s.charAt(i);
	                map.put(start_char, map.getOrDefault(start_char, 0) + 1);

	                if (map.get(start_char) > 0) {
	                    requiredCount++;
	                }
	                i++;
	            }
	            j++;

	        }
	        return minWindowSize == Integer.MAX_VALUE ? "" : s.substring(i_start, i_start + minWindowSize);
	    }
}
