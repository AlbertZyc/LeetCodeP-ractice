package com.hotyoso.leetcode.questions;

import java.util.Stack;

public class RemoveOuterParentheses {
    public static String removeOuterParentheses(String S) {
        int left = 0 ;
        StringBuilder sd = new StringBuilder();
        for(int i = 0 ; i < S.length(); i ++){
            if(S.charAt(i)=='('&&left ++ > 0 ){
                sd.append("(");
            }
            if(S.charAt(i)==')'&&--left  > 0 ){
                sd.append(")");
            }
        }
        return sd.toString();
    }
    public String removeOuterParentheses2(String S) {
       StringBuilder sd = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int start =0 ,end = 0;
        boolean flag = false;
        for(int i = 0; i < S.length() ; i++){
            char ch = S.charAt(i);
            if(ch == '('){
                stack.push(ch);
                if(flag){
                    start = i ;
                    flag = true;
                }
            }
        }
        return null;
    }
}
