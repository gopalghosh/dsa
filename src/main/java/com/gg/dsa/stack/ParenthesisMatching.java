package com.gg.dsa.stack;

import java.util.Stack;

public class ParenthesisMatching {

    public static void main(String[] args) {
        String s= "(()){4454}(){{}}";
        System.out.println(parenthesisMatcher(s));
    }


    public static boolean parenthesisMatcher(String str){
        Stack<Character> stack=new Stack();
        int count=0;
        while (count<str.length()){
            char ch=str.charAt(count);
            switch (ch){
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case')':
                   if( !stack.isEmpty() && '('==stack.peek()){
                       stack.pop();
                   }else{
                       stack.push(ch);
                   }
                   break;
                case'}':
                    if( !stack.isEmpty() && '{'==stack.peek()){
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                    break;
                case']':
                    if( !stack.isEmpty() && '['==stack.peek()){
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                    break;
            }
            count++;
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
