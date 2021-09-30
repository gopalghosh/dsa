package com.gg.dsa.stack;

import java.util.Stack;

public class LongestValidParenthesis {
    public static void main(String[] args) {
        String input = "()(()))))))";
        System.out.println(maxValidLength(input));
    }


    public static int maxValidLength(String input) {
        int result = 0;
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int count = 0;
        while (count < input.length()) {
            char ch = input.charAt(count);
            if (ch == '(') {
                s.push(count);
            } else {
                if (!s.isEmpty()) {
                    s.pop();
                }
                if (!s.isEmpty()) {
                    result = Math.max(result,
                            count - s.peek());
                }
                else {
                    s.push(count);
                }
            }
            count++;
        }
        return result;
    }

}
