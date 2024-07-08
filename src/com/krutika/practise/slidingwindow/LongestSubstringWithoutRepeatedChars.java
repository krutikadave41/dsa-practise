package com.krutika.practise.slidingwindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatedChars {
	public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int len = s.length();
        HashSet<Character> set = new HashSet<Character>();
        int l = 0;
        for (int r = 0; r < len; r++) {
            if (set.add(s.charAt(r))) {
                maxLength = Math.max(maxLength, r-l+1);
            } else {
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(r));
            }
        }
        return maxLength;
    }
	
	public static void main(String[] args) {
		String s = "abcabcbb";
		LongestSubstringWithoutRepeatedChars obj = new LongestSubstringWithoutRepeatedChars();
		System.out.println(obj.lengthOfLongestSubstring(s));
	}
}
