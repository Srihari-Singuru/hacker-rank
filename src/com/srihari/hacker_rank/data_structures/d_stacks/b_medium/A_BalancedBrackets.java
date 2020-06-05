package com.srihari.hacker_rank.data_structures.d_stacks.b_medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/balanced-brackets/problem
 */
public class A_BalancedBrackets {
    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Map<Character, Character> openToClosed = new HashMap<>(){{put('{', '}');put('[', ']');put('(', ')');}};
        Map<Character, Character> closedToOpen = new HashMap<>(){{put('}', '{');put(']', '[');put(')', '(');}};
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(openToClosed.containsKey(c)){    // we can use list.contains, but complexity will be O(n)
                stack.push(c);
            }else{
                if(!stack.isEmpty() && stack.peek() == closedToOpen.get(c)){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty()?"YES":"NO";
    }

    public static void main(String[] args) {
        String s = "{{[[(())]]}}";
        String result = isBalanced(s);
        System.out.println(result);
    }
}
