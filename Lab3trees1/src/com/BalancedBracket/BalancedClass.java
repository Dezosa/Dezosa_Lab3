package com.BalancedBracket;

import java.util.Stack;

public class BalancedClass {
	
	public boolean balancedParenthesis(String inputValue) {   
        
        
        Stack<Character> stack = new Stack<Character>();     
        char[] charArray = inputValue.toCharArray();   
        for (int i = 0; i < charArray.length; i++) {     
            char pushChar = charArray[i];    
            if (pushChar == '{' || pushChar == '[' || pushChar  == '(') {   
                 
                stack.push(pushChar);   
                continue;   
            }   
              
            if (stack.isEmpty()) {    
                return false;   
            }      
            char popChar;   
            switch (pushChar) {   
                case ')':   
                popChar = stack.pop();   
                if (popChar == '{' || popChar == '[')   
                    return false;   
                break;   
                case '}':   
                popChar = stack.pop();   
                if (popChar == '(' || popChar == '[')   
                    return false;   
                break;   
                case ']':   
                popChar =stack.pop();   
                if (popChar == '(' || popChar == '{')   
                    return false;   
                break;   
            }   
        }   
        return (stack.isEmpty());   
	}
}