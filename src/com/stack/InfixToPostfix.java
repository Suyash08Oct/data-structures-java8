package com.stack;

import com.stack.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "A+B*C+D";
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix Form is: " + postfix);
    }

    public static String infixToPostfix(String infix){
        StringBuilder postfix = new StringBuilder();
        Stack stack = new Stack(infix.length());

        for (char value : infix.toCharArray()) {
            if (value == '+' || value == '-' || value == '*' || value == '/') {
                int priority = getPriority(value);

                while (!stack.isEmpty() && priority <= getPriority(stack.peek())) {
                    char c = stack.pop();
                    postfix.append(c);
                }

                stack.push(value);
            } else {
                postfix.append(value);
            }
        }

        while (!stack.isEmpty()){
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static int getPriority(char operator) {
        if (operator == '+' || operator == '-')
            return 1;
        else if (operator == '*' || operator == '/')
            return 2;
        else
            return -1;
    }
}
