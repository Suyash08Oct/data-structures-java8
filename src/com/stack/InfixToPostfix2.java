package com.stack;

/**
 * Program to convert infix form of expression to postfix.
 * Program is capable of handling infix expression having +, -, *, /, (, ), ^ operators.
 */
public class InfixToPostfix2 {
    public static void main(String[] args) {
        String infix = "A+B*C/(D-E)";
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix Form is: " + postfix);
    }

    public static String infixToPostfix(String infix){
        StringBuilder postfix = new StringBuilder();
        Stack stack = new Stack(infix.length());

        for (char value : infix.toCharArray()) {
            if (isOperation(value)) {
                int priority = getOutStackPriority(value);

                while (!stack.isEmpty() && priority <= getInStackPriority(stack.peek())) {
                    char c = stack.pop();

                    if(isFamily(c, value)){
                        // Its a Match, with two brackets
                        break;
                    } else {
                        // Brackets are always escaped in the postfix expression
                        postfix.append(c);
                    }
                }

                if(value != ')'){
                    stack.push(value);
                }
            } else {
                postfix.append(value);
            }
        }

        while (!stack.isEmpty()){
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static int getInStackPriority(char operator) {
        if (operator == '+' || operator == '-')
            return 2;
        else if (operator == '*' || operator == '/')
            return 4;
        else if(operator == '^')
            return 5;
        else if(operator == '(')
            return 0;
        else
            return -1;
    }

    public static int getOutStackPriority(char operator) {
        if (operator == '+' || operator == '-')
            return 1;
        else if (operator == '*' || operator == '/')
            return 3;
        else if(operator == '^')
            return 6;
        else if(operator == '(')
            return 7;
        else if(operator == ')')
            return 0;
        else
            return -1;
    }

    public static boolean isOperation(char value){
        if(value == '+' || value == '-' || value == '*' || value == '/' ||
        value == '(' || value == ')' || value == '^')
            return true;
        else
            return false;
    }

    public static boolean isFamily(char a, char b){
        if(a == '(' && b == ')')
            return true;
        else if(a == '[' && b == ']')
            return true;
        else if(a == '{' && b == '}')
            return true;
        else
            return false;
    }
}
