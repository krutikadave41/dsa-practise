package com.krutika.practise.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		GroupAnagrams obj = new GroupAnagrams();
		System.out.println(obj.groupAnagrams(strs));

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] keyArr = str.toCharArray();
			Arrays.sort(keyArr);
			String key = new String(keyArr);
			if (map.containsKey(key)) {
				map.get(key).add(str);
			} else {
				List<String> newList = new ArrayList<>();
				newList.add(str);
				map.put(key, newList);
			}
		}
		return new ArrayList<>(map.values());
	}

	public List<List<String>> groupAnagrams2(String[] str) {
		Map<String, List<String>> map = new HashMap<>();
		for (String s : str) {
			int[] count = new int[26];
			for (char c : s.toCharArray()) {
				count[c - 'a']++;
			}

			String key = Arrays.toString(count);

			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			map.get(key).add(s);
		}
		return new ArrayList<>(map.values());
	}

}
