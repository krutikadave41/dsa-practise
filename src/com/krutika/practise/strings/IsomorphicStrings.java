package com.krutika.practise.strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s = "egg", t = "add";
		IsomorphicStrings obj = new IsomorphicStrings();
		System.out.println(obj.isIsomorphic(s, t));
	}
	public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (!map.containsValue(t.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(i));
                } else {
                    return false;
                }
            } else {
                char mappedChar = map.get(s.charAt(i));
                char replacement = t.charAt(i);
                if (mappedChar != replacement) {
                    return false;
                }
            }
        }

        return true;
    }
}
