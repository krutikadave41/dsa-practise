package com.krutika.practise.stacks;

import java.util.Stack;

public class ValidParenthesis {
	public static void main(String[] args) {
		ValidParenthesis obj = new ValidParenthesis();
		String s = "(*)";
		boolean isValid = obj.checkValidString(s);
		System.out.println(isValid);
	}
	public boolean checkValidString(String s) {
        Stack<Integer> openBrackets = new Stack<Integer>();
        Stack<Integer> aestricks = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openBrackets.push(i);
            } else if (s.charAt(i) == '*') {
                aestricks.push(i);
            } else {
                // closing brackets case
                if (!openBrackets.isEmpty()) {
                    openBrackets.pop();
                } else if (!aestricks.isEmpty()) {
                    aestricks.pop();
                } else {
                    return false;
                }
            }
        }
        while (!openBrackets.isEmpty()) {
            if (aestricks.isEmpty()) {
                return false;
            } else {
                int openIndex = openBrackets.pop();
                int closingIndex = aestricks.pop();
                if (openIndex > closingIndex) {
                    return false;
                }
            }

        }

        return openBrackets.isEmpty();
    }
}
